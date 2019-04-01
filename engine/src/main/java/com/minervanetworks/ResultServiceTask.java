package com.minervanetworks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service(value = "resultServiceTask")
public class ResultServiceTask implements JavaDelegate {

    public void execute(DelegateExecution execution){
        Boolean success  = (Boolean) execution.getVariable("success");
        System.out.println("received "+ success + " for success !!! ");
   }
}

