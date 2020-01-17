package com.example.oraclemybatis.contrller;


import com.example.oraclemybatis.pojo.User;
import com.example.oraclemybatis.service.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("queryCount")
    @ResponseBody
    public int Count(){
        return userService.count();
    }

    @RequestMapping("userlist")
    @ResponseBody
    public List<User> userList(){
        return userService.userList();
    }

    @RequestMapping("wenti")
    @ResponseBody
    public String Q(String tiwen1){
        return userService.Q(tiwen1);
    }

    @RequestMapping("addUser")
    @ResponseBody
    public int addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping("delete")
    @ResponseBody
    public int deleteUser(int id){
        return userService.deleteUser(id);
    }

    @RequestMapping("update")
    @ResponseBody
    public int updateUser(User user){
        return userService.updateUser(user);
    }

    @PostMapping("/login")
    public Object loginUser(User user) {
        Map<String,Object> result = new HashMap<String, Object>();
        System.err.println(user);
        User u1 =  userService.getUserByUserName(user);

        if(user.getPassword().equals(u1.getPassword())) {
            result.put("code", 200);
            result.put("msg", "登录成功");
            result.put("token", "adminxxxx");
            return result;
        }
        result.put("code", 500);
        result.put("msg", "登录失败");
        return result;
    }
}
