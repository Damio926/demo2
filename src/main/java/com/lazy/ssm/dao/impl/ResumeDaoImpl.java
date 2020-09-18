package com.lazy.ssm.dao.impl;


import com.lazy.ssm.dao.IResumeDao;
import com.lazy.ssm.mapper.ResumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("resumeDao")
public class ResumeDaoImpl implements IResumeDao {
//    自动装配，自动装载
    @Autowired
    private ResumeMapper resumeMapper;
}
