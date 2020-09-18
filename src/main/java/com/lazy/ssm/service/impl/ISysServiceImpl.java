package com.lazy.ssm.service.impl;


import com.lazy.ssm.dao.ISysLogDao;

import com.lazy.ssm.pojo.SysLog;
import com.lazy.ssm.service.ISysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("sysLogService")
public class ISysServiceImpl implements ISysService {
    @Autowired
    private ISysLogDao sysLogDao;
    /**
     * 当前操作需要事务,操作异常时，回滚事务
     * REQUIRES_NEW  (当前方法调用重新创建一个新的事务)
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public int insertSysLog(SysLog log) {
        return sysLogDao.insertSysLog(log);
    }


}
