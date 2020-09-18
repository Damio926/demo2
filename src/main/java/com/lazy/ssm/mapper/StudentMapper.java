package com.lazy.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lazy.ssm.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Student Mapper 接口
 */
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> selectList(@Param("student") Student student);

//     List<Student> selectAll(@Param("student") Student student);

//    List<Student> selectList(String student);

//    List<Student> selectList(Student student);
}
