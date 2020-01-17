package com.example.oraclemybatis.service.task;

import com.example.oraclemybatis.pojo.Content;
import com.example.oraclemybatis.pojo.Task;

import java.util.List;

public interface TaskService {

    //查询所有task
    public List<Task> queryAllTask();
}
