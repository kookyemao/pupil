package com.example.oraclemybatis.pojo;

public class Content {
    private int title_id;//对应标题ID
    private int days;
    private String sort;//技能分类
    private String type;//技能类型
    private String target;//学习目标
    private String depict;//技能描述

    private String taskName;


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

}
