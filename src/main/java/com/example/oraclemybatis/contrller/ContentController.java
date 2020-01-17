package com.example.oraclemybatis.contrller;

import com.example.oraclemybatis.pojo.Content;
import com.example.oraclemybatis.pojo.Task;
import com.example.oraclemybatis.service.content.ContentService;
import com.example.oraclemybatis.service.content.ContentServiceImpl;
import com.example.oraclemybatis.service.task.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ContentController {

    @Resource
    private ContentService contentService;

    @RequestMapping("queryContentById")
    @ResponseBody
    public List<Content> queryContentById(int id){
        List<Content> contentList = new ArrayList<>();
        System.out.println(id);
        contentList.add(contentService.queryContentByID(id));
        return contentList;
    }

    @RequestMapping("addContent")
    @ResponseBody
    public int addContent(Content content){

        return contentService.addContent(content);
    }

}
