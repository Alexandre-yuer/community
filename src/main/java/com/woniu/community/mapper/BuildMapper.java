package com.woniu.community.mapper;

import com.woniu.community.entity.Build;
import com.woniu.community.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuildMapper {
    List<Build> selectAll(@Param("start") int start, @Param("size") int size);

    int selectCount();

    int insertBuild(Build build);

    int updateBuild(Build build);

    int deleteBuild(int id);

    Build selectBuildById(int id);
}
