package com.minervanetworks.someEntity;

import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MinervaEntityController {

    @Autowired
    MinervaEntitiRepository minervaEntitiRepository;

    @Autowired
    MinervaEntityService minervaEntityService;

    @Autowired
    TaskService taskService;
//
//    @RequestMapping(method = RequestMethod.POST, value = "/start")
//    public String uploadEntity(AbstractMultipartHttpServletRequest request/*, Principal principal*/){
//        System.out.println("uploading");
//        Optional.ofNullable(request.getMultiFileMap()).ifPresent(m -> {
//
//// doing something
//
//
//        });
//        System.out.println("uploading done");
//        return "";
//    }


    @RequestMapping(method = RequestMethod.GET, value = "/userProcessPage")
    public String getUserProcessPage(Model model){
        List<Task> outstandingTasks = taskService.createTaskQuery().list();
        outstandingTasks.forEach(p-> model.addAttribute("task", p));
        return "redirect:userProcess";
    }





}
