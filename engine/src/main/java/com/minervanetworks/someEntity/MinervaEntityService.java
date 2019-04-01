package com.minervanetworks.someEntity;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MinervaEntityService {

    @Autowired
    TaskService taskService;

    @Autowired
    RuntimeService runtimeService;

    @Autowired
    MinervaEntitiRepository entitiRepository;

    @Value("file://#{systemProperties['user.home']}")
    private String userHome;

//    Process Instance is the reference to this execution - where am I , how am I doing etc
    public ProcessInstance launchMyProcess(String content){
      String processKey = "testProcess";
      return runtimeService.startProcessInstanceByKey(processKey, content);
    }

}
