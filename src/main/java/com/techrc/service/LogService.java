package com.techrc.service;


import com.techrc.mapper.LogMapper;
import com.techrc.model.CommonLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogService {

    @Autowired
    private LogMapper logMapper;

    @Transactional
    public  void addLogInfo(CommonLog commonLog){
        logMapper.addLogInfo(commonLog);

    }

}
