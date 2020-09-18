package com.lazy.ssm.service.impl;


import com.lazy.ssm.dao.IResumeDao;
import com.lazy.ssm.service.IResumeService;
import org.springframework.stereotype.Service;

@Service("resumeService")
public class IResumeServiceImpl implements IResumeService {
    private IResumeDao resumeDao;
}
