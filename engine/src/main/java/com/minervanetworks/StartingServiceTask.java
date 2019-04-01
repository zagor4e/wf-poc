package com.minervanetworks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(value = "startingServiceTask")
public class StartingServiceTask implements JavaDelegate {

    private static Logger log = LoggerFactory.getLogger(StartingServiceTask.class);

    public void execute(DelegateExecution execution){

        log.info("in Starting bean .... GO GIRL GO ");
        log.info(execution.getId());
    }

}
