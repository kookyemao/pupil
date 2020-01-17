package com.example.oraclemybatis.service.user;

import com.example.oraclemybatis.dao.UserMapper;
import com.example.oraclemybatis.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int count() {
        return userMapper.count();
    }

    @Override
    public List<User> userList() {
        return userMapper.userList();
    }

    @Override
    public String Q(String tiwen1) {
        System.out.println(tiwen1);
        if (tiwen1.equals("电信")){
            return "电信客服";
        }else {
            return "听不懂呢！";
        }
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User getUserByUserName(User user) {
        return userMapper.getUserByUserName(user);
    }

    public static void main(String[] args) {
        UserServiceImpl userServiceimpl = new UserServiceImpl();
        userServiceimpl.show(1);
    }

    private void show(int a ){
        if (a>5){
            return;
        }
        System.out.println(a);

        show(a+1);
        System.out.println("第"+a);
    }
}
