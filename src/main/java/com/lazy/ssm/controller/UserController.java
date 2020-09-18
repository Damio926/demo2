package com.lazy.ssm.controller;

import com.lazy.ssm.pojo.Student;
import com.lazy.ssm.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private StudentServiceImpl studentService;


    @RequestMapping("/select")
    public String  selectAll(Student student, Model model){
//        List<Student> list = studentService.selectAll(student);
         Student list = studentService.selectOne(1);
        model.addAttribute("list",list);
        return "user/select";
    }
//    @Autowired
//    private UserService userService;
//
////    @RequestMapping("/select")
////    public String  selectAll(User user, Model model){
////        List<User> list = userService.SelectAll(user);
////        model.addAttribute("list",list);
////        return "user/select";
////    }
////查询所有员工
//    @RequestMapping("/select")
//    public String  selectStaff(Staff staff, Model model){
//        List<Staff> list = userService.SelectStaff(staff);
//        model.addAttribute("list",list);
//        return "user/select";
//    }
//    //新增员工
//    @RequestMapping(value = "/insert",method = RequestMethod.POST)
//    public String insert(Staff staff) {
//        boolean flag = userService.AddStaff(staff);
//        return "redirect:/user/select";
//    }
//    //    删除一条数据
//    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
//    public String delete(@PathVariable int id) {
//        boolean flag = userService.DeleteStaff(id);
//        return "redirect:/user/select";
//    }
    /**
     * 登录
     */
    @RequestMapping("/login")
    public String UserLogin(Student student, Model model){

        return "user/login";
    }
}
