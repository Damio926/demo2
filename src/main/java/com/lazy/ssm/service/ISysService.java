package com.lazy.ssm.service;

import com.lazy.ssm.pojo.SysLog;

/**
 * 系统业务类接口
 */
public interface ISysService {
    /**
     * 添加系统的日志
     * @param log
     * @return
     */
    int insertSysLog(SysLog log);
}
