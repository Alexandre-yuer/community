package com.woniu.community.mapper;

import com.woniu.community.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User selectByNameAndPwd(@Param("username") String username, @Param("passwd") String passwd);

    List<User> selectAll(@Param("start") int start, @Param("size") int size);

    int selectCount();

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    User selectUserById(int id);
}
