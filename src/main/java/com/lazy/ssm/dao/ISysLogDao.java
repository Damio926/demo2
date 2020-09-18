package com.lazy.ssm.dao;


import com.lazy.ssm.pojo.SysLog;

/**
 * 添加日志
 */
public interface ISysLogDao {
    /**
     * 添加系统的日志
     * @param log
     * @return
     */
    int insertSysLog(SysLog log);
}
