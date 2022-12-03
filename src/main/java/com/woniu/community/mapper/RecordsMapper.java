package com.woniu.community.mapper;


import com.woniu.community.entity.Parking;
import com.woniu.community.entity.Records;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordsMapper {
    List<Records> selectAll(@Param("numbers") String numbers,@Param("type") String type, @Param("start") int start, @Param("size") int size);

    int count(@Param("numbers") String numbers,@Param("type") String type);

    int insertRecords(Records records);

    int deleteRecords(int id);

    int updateRecords(Records records);

    Records selectById(int id);
}
