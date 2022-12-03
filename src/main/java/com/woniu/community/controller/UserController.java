package com.woniu.community.controller;

import com.woniu.community.entity.User;
import com.woniu.community.entity.vo.UserVO;
import com.woniu.community.service.IUserService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
//    public HttpResult login(UserVO vo)
    public HttpResult login(@RequestBody UserVO vo){
        return userService.login(vo.getUsername(), vo.getPassword());
    }

    @RequestMapping("/list")
    public HttpResult getUsers(int pageIndex, int pageSize){
        return userService.getUsers(pageIndex, pageSize);
    }

    @PostMapping("/add")
    public HttpResult addUser(@RequestBody UserVO vo){
        User user = new User();
        user.setUsername(vo.getUsername());
        user.setPassword(vo.getPassword());
        return userService.addUser(user);
    }

    @RequestMapping("/remove")
    public HttpResult removeUser(int id){
        return userService.removeUser(id);
    }

    @PostMapping("/update")
    public HttpResult updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @RequestMapping("/info")
    public HttpResult getUserInfo(int id){
        return userService.getUserInfo(id);
    }
}
