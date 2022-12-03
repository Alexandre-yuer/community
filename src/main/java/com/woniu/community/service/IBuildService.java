package com.woniu.community.service;

import com.woniu.community.entity.Build;
import com.woniu.community.entity.User;
import com.woniu.community.utils.HttpResult;

public interface IBuildService {
    /**
     * 查询楼宇列表,分页查询
     * @param pageIndex 页码
     * @param pageSize 每页的条数
     * @return
     */
    HttpResult getBuilds(int pageIndex, int pageSize);

    /**
     * 添加楼宇信息
     * @param build
     * @return
     */
    HttpResult addBuild(Build build);

    /**
     * 删除楼宇信息,根据id
     * @param id
     * @return
     */
    HttpResult removeBuild(int id);

    /**
     * 修改楼宇信息
     * @param build
     * @return
     */
    HttpResult updateBuild(Build build);

    /**
     * 查询楼宇信息,根据id
     * @param id
     * @return
     */
    HttpResult getBuildInfo(int id);
}
