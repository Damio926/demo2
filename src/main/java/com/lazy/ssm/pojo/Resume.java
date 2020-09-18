package com.lazy.ssm.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 学生简历实体类
 */
@Alias("resume")
@Data
@TableName("resume")
public class Resume {
    /***
     * 简历ID
     */
    @TableId
    private Integer resId;
    /**
     * 学生ID(外键)
     */
    private Integer stuId;
    /**
     * 简历标题
     */
    private String title;
    /**
     * 简历语种
     */
    private String lang;
    /*
    * 简历只属于一个学生
    * */
    @TableField(exist = false)
    private Student stu;

    public Resume() {
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resId=" + resId +
                ", stuId=" + stuId +
                ", title='" + title + '\'' +
                ", lang='" + lang + '\'' +
                ", stu=" + stu +
                '}';
    }
}
