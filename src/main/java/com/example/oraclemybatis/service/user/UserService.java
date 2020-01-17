package com.example.oraclemybatis.service.user;

import com.example.oraclemybatis.pojo.User;

import java.util.List;

public interface UserService {
    public int count();

    public List<User> userList();

    public String Q(String tiwen1);

    public int addUser(User user);

    public int deleteUser(Integer id);

    public int updateUser(User user);

    public User getUserByUserName(User user);
}
