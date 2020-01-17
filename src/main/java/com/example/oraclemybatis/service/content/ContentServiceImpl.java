package com.example.oraclemybatis.service.content;

import com.example.oraclemybatis.dao.ContentMapper;
import com.example.oraclemybatis.dao.TaskMapper;
import com.example.oraclemybatis.pojo.Content;
import com.example.oraclemybatis.pojo.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Service
@Transactional
public class ContentServiceImpl implements ContentService {
    @Resource
    private ContentMapper contentMapper;

    @Resource
    private TaskMapper taskMapper;

    @Override
    public int addContent(Content content) {
        Task task = new Task();
        task.setTaskName(content.getTaskName());
        //添加task成功后返回1
        int i = taskMapper.addTask(task);
        int k = 0;
        if (i>0){
            //添加task成功后继续添加content
            content.setTitle_id(task.getId());
            k = contentMapper.addContent(content);
        }
        return k;
    }

    @Override
    public Content queryContentByID(Integer id) {
        return contentMapper.queryContentByID(id);
    }

}
