package com.woniu.community.service.impl;

import com.woniu.community.entity.User;
import com.woniu.community.mapper.UserMapper;
import com.woniu.community.service.IUserService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired(required = false)
    private UserMapper userMapper;//获取mapper对象,用于操作数据库

    @Override
    public HttpResult login(String userName, String passwd) {
        //根据传递的用户名和密码,查询数据库中是否存在该记录,如果存在则说明用户存在,登录成功
        User user = userMapper.selectByNameAndPwd(userName, passwd);

        HttpResult result = null;
        if (user != null) {
            result = new HttpResult(user, 0, 200, null);
        } else {
            result = new HttpResult(null, 0, 500, "用户名或密码错误");
        }
        return result;
    }

    @Override
    public HttpResult getUsers(int pageIndex, int pageSize) {
        //分页查询
        List<User> users = userMapper.selectAll((pageIndex - 1) * pageSize, pageSize);
        //获取总条数
        int count = userMapper.selectCount();

        HttpResult result = null;
        if (users != null && users.size() > 0) {//说明一定查到数据了
            result = new HttpResult(users, count, 200, null);
        } else {
            result = new HttpResult(null, 0, 500, "没有更多数据");
        }
        return result;
    }

    @Override
    public HttpResult addUser(User user) {
        int count = userMapper.insertUser(user);//添加用户
        HttpResult result = null;
        if(count > 0){//成功
            result = new HttpResult(null, 0, 200, "添加用户成功");
        }else {//失败
            result = new HttpResult(null, 0, 500, "添加用户失败");
        }
        return result;
    }

    @Override
    public HttpResult removeUser(int id) {
        int count = userMapper.deleteUser(id);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null, 0, 200, "删除用户成功");
        }else {
            result = new HttpResult(null, 0, 500, "删除用户失败");
        }
        return result;
    }

    @Override
    public HttpResult updateUser(User user) {
        int count = userMapper.updateUser(user);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null, 0, 200, "修改用户成功");
        }else {
            result = new HttpResult(null, 0, 500, "修改用户失败");
        }
        return result;
    }

    @Override
    public HttpResult getUserInfo(int id) {
        User user = userMapper.selectUserById(id);
        HttpResult result = null;
        if(user != null){
            result = new HttpResult(user, 0, 200, null);
        }else {
            result = new HttpResult(null, 0, 500, "没有更多数据");
        }
        return result;
    }
}
