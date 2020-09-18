package com.lazy.test;


import com.lazy.ssm.pojo.Student;
import com.lazy.ssm.service.IStudentService;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestStudent {
//    查询一个学生
    @Test
    public void testStudent(){
//        加载spring配置文件,获取spring上下文对象
         AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        从spring上下文中获取studentService对象
         IStudentService studentService = (IStudentService) context.getBean("studentService");
         Student dao = new Student();
         Student student = studentService.selectOne(1);
//       List<Student> student = studentService.selectAll(dao);
         System.out.println("受影响的行数："+student);
//        关闭spring上下文
        context.close();
    }
    //    添加一个学生
    @Test
    public void insertStudent(){
        //        加载spring配置文件,获取spring上下文对象
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        从spring上下文中获取studentService对象
        IStudentService studentService = (IStudentService) context.getBean("studentService");
        Student stu = new Student();
        stu.setNames("zq");
        stu.setSex(1);
        stu.setIdCard("4664646");
        stu.setSubject("教育");
        int flag = studentService.insertStudent(stu);
        System.out.println("受影响的行数："+flag);
        context.close();
    }
    //    删除一个学生
    @Test
    public void deleteStudent(){
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = (IStudentService) context.getBean("studentService");
        int flag = studentService.deleteStudent(16);
        System.out.println("受影响的行数："+flag);
    }
    //    修改一个学生
    @Test
    public void updateStudent(){
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = (IStudentService) context.getBean("studentService");
        Student stu = new Student();
        stu.setId(1);
        stu.setNames("zq");
        stu.setSex(1);
        stu.setIdCard("4664646");
        stu.setSubject("教育");
        stu.setEdu(66);
        int flag = studentService.updateStudent(stu);
        System.out.println("受影响的行数："+flag);
    }
}
