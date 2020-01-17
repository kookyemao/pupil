package com.example.oraclemybatis.dao;

import com.example.oraclemybatis.pojo.Task;

import java.util.List;

public interface TaskMapper {
    //增加task
    public int addTask(Task task);
    //查询所有task
    public List<Task> queryAllTask();
}
