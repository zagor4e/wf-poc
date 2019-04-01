package com.minervanetworks;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessExecutorService {

    @Autowired
    private RuntimeService runtimeService;


    public void run(){
        runtimeService.startProcessInstanceByKey("testProcess");

    }
}
