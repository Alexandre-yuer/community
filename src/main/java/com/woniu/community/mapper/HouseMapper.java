package com.woniu.community.mapper;

import com.woniu.community.entity.House;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMapper {
    List<House> selectAll(@Param("number") String number, @Param("start") int start, @Param("size") int size);

    int count(String number);

    int insertHouse(House house);

    int deleteHouse(int id);

    int updateHouse(House house);

    House selectById(int id);
}
