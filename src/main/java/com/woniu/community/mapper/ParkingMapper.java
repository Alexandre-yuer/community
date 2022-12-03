package com.woniu.community.mapper;

import com.woniu.community.entity.Owner;
import com.woniu.community.entity.Parking;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParkingMapper {
    List<Parking> selectAll(@Param("numbers") String numbers, @Param("start") int start, @Param("size") int size);

    int count(String numbers);

    int insertParking(Parking parking);

    int deleteParking(int id);

    int updateParking(Parking parking);

    Parking selectById(int id);
}
