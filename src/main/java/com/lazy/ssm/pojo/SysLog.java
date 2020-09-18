package com.lazy.ssm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("log")
@Data
@TableName("sys_log")
public class SysLog {
    /**
     * 日志ID
     */
    @TableId(type = IdType.AUTO)
    private Integer logId;
    /*
     * 调用方法名
     **/
    private String methodName;
    /**
     * 业务类名称
     */
    private String className;
    /**
     * 调用时间
     */
    private Date callTime;
    /**
     * 日志类型(1:信息;2:异常)
     */
    private Integer logType;
    /**
     * 异常类名
     */
    private String exceptionName;
    /**
     * 异常消息
     */
    private String message;

    public SysLog() {
    }

    @Override
    public String toString() {
        return "SysLog{" +
                "logId=" + logId +
                ", methodName='" + methodName + '\'' +
                ", className='" + className + '\'' +
                ", callTime=" + callTime +
                ", logType=" + logType +
                ", exceptionName='" + exceptionName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
