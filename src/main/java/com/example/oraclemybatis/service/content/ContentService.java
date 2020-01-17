package com.example.oraclemybatis.service.content;

import com.example.oraclemybatis.pojo.Content;

public interface ContentService {
    //增加内容
    public int addContent(Content content);
   //增加task
//    public int addTask(Task task);
    //查询内容根据id
    public Content queryContentByID(Integer id);
}
