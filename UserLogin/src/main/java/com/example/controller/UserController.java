package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.util.Result;
import com.example.util.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

/**
 * @author sweet
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    //@CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultFactory.failResult(bindingResult.getFieldError().getDefaultMessage());
        }
        return userService.login(user);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Result register(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultFactory.failResult(bindingResult.getFieldError().getDefaultMessage());
        }
        return userService.register(user);
    }
}
