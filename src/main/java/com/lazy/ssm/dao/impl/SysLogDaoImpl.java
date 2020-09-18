package com.lazy.ssm.dao.impl;


import com.lazy.ssm.dao.ISysLogDao;
import com.lazy.ssm.mapper.SysLogMapper;
import com.lazy.ssm.pojo.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sysLogDao")
public class SysLogDaoImpl implements ISysLogDao {
    @Autowired
    private SysLogMapper sysLogMapper;

    public int insertSysLog(SysLog log) {
        return sysLogMapper.insert(log);
    }
}
