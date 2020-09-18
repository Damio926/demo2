package com.lazy.ssm.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.lazy.ssm.dao.IStudentDao;
import com.lazy.ssm.mapper.StudentMapper;
import com.lazy.ssm.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {
    @Autowired
    private StudentMapper studentMapper;

    public int insertStudent(Student student) {
        return studentMapper.insert(student);
    }

    public int deleteStudent(Integer id) {
        return studentMapper.deleteById(id);
    }

    public int updateStudent(Student student) {
        return studentMapper.updateById(student);
    }

    @Override
    public List<Student> selectAll(Student student) {
        return studentMapper.selectList(student);
    }


//    public List<Student> selectStudent() {
//        return studentMapper.selectList();
//    }

//    public List<Student> selectStudent(int sex, int edu) {
//        /**
//         *  QueryWraper 用来打包查询条件
//         */
//
//        QueryWrapper<Student> wrapper = new QueryWrapper<Student>();
//        wrapper.eq("sex",sex);
//        wrapper.eq("edu",edu);
//        return studentMapper.selectList(wrapper);
//    }

    public Student selectOne(Integer id) {
        return studentMapper.selectById(id);
    }
}
