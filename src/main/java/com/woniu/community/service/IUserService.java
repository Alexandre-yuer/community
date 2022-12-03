package com.woniu.community.service;

import com.woniu.community.entity.User;
import com.woniu.community.utils.HttpResult;

import java.util.List;

public interface IUserService {
    /**
     * 用户登录
     * @param userName 用户名
     * @param passwd 密码
     * @return
     */
    HttpResult login(String userName,String passwd);

    /**
     * 查询用户列表,分页查询
     * @param pageIndex 页码
     * @param pageSize 每页的条数
     * @return
     */
    HttpResult getUsers(int pageIndex, int pageSize);

    /**
     * 添加用户
     * @param user
     * @return
     */
    HttpResult addUser(User user);

    /**
     * 删除用户,根据id
     * @param id
     * @return
     */
    HttpResult removeUser(int id);

    /**
     * 修改用户
     * @param user
     * @return
     */
    HttpResult updateUser(User user);

    /**
     * 查询用户,根据id
     * @param id
     * @return
     */
    HttpResult getUserInfo(int id);
}
