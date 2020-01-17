package com.example.oraclemybatis.dao;

import com.example.oraclemybatis.pojo.User;

import java.util.List;


public interface UserMapper {

    public int count();

    public List<User> userList();

    public int addUser(User user);

    public int deleteUser(Integer id);

    public int updateUser(User user);

    public User getUserByUserName(User user);

}
