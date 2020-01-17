package com.example.oraclemybatis.service.task;

import com.example.oraclemybatis.dao.ContentMapper;
import com.example.oraclemybatis.dao.TaskMapper;
import com.example.oraclemybatis.pojo.Content;
import com.example.oraclemybatis.pojo.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class TaskServiceImpl implements TaskService {
    @Resource
    private TaskMapper taskMapper;

    @Override
    public List<Task> queryAllTask() {

        return taskMapper.queryAllTask();
    }


}
