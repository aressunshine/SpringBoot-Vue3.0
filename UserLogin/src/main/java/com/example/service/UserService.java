package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.util.Result;
import com.example.util.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author sweet
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Result login(User user) {
        User u = userMapper.selectByUserName(user.getUsername());
        if (!Objects.equals(u.getUsername(), user.getUsername()) || !Objects.equals(u.getPassword(), user.getPassword())) {
            return ResultFactory.failResult("用户名或密码错误！");
        }
        return ResultFactory.successResult("登陆成功");
    }

    public Result register(User user) {
        userMapper.insertUser(user);
        return ResultFactory.successResult("注册成功");
    }
}
