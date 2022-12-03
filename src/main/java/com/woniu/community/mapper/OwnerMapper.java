package com.woniu.community.mapper;


import com.woniu.community.entity.House;
import com.woniu.community.entity.Owner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OwnerMapper {
    List<Owner> selectAll(@Param("tel")String tel,@Param("identity")String identity,@Param("start") int start, @Param("size") int size);

    int count(@Param("tel")String tel,@Param("identity")String identity);

    int insertOwner(Owner owner);

    int deleteOwner(int id);

    int updateOwner(Owner owner);

    Owner selectById(int id);
}
