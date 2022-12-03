package com.woniu.community.mapper;

import com.woniu.community.entity.PropertyInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyInfoMapper {
    List<PropertyInfo> selectAll(@Param("numbers") String numbers, @Param("status") String status, @Param("start") int start, @Param("size") int size);

    int count(@Param("numbers") String numbers,@Param("status") String status);

    int insertPropertyInfo(PropertyInfo propertyInfo);

    int deletePropertyInfo(int id);

    int updatePropertyInfo(PropertyInfo propertyInfo);

    PropertyInfo selectById(int id);
}
