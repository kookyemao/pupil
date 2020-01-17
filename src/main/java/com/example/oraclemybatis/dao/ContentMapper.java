package com.example.oraclemybatis.dao;

import com.example.oraclemybatis.pojo.Content;

public interface ContentMapper {
    //增加内容
    public int addContent(Content content);
    //查询内容根据id
    public Content queryContentByID(Integer id);

}
