package com.lazy.ssm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

/*
    实体类别名
 */
@Alias("student")
@Data
@TableName("student")
public class Student {

    /**
     * 学生ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 姓名
     */
//    @TableField(value = "names")
    private String names;
    /**
     * 性别(1:男;2:女)
     */

    private Integer sex;
    /**
     * 身份证号码
     */
    @TableField(value = "card")
    private String idCard;
    /**
     * 专业
     */
    private String subject;
    /**
     * 学历(1:中专;2:大专;3:本科;4:硕士;5:其它)
     */
    private Integer edu;

      /*
      *
      * 一个学生有多个简历
      * */
//    @TableField(exist = false)
//    private List<Resume> resumeList;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", sex=" + sex +
                ", idCard='" + idCard + '\'' +
                ", subject='" + subject + '\'' +
                ", edu=" + edu +
                '}';
    }
}
