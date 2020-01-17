package com.example.oraclemybatis.contrller;

import com.example.oraclemybatis.pojo.Task;
import com.example.oraclemybatis.service.task.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TaskController {

    @Resource
    private TaskService taskService;

    @RequestMapping("taskList")
    @ResponseBody
    public List<Task> queryAllTask(){

        return taskService.queryAllTask();
    }


}
