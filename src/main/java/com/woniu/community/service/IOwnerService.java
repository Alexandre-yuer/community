package com.woniu.community.service;

import com.woniu.community.entity.House;
import com.woniu.community.entity.Owner;
import com.woniu.community.utils.HttpResult;

public interface IOwnerService {
    /**
     * 获取业主列表
     * @param pageIndex 页码
     * @param pageSize 每页条数
     * @return
     */
    HttpResult getOwnerList(String tel,String identity,int pageIndex, int pageSize);

    /**
     * 添加业主信息
     * @param owner
     * @return
     */
    HttpResult saveOwner(Owner owner);

    /**
     * 修改业主信息
     * @param owner
     * @return
     */
    HttpResult updateOwner(Owner owner);

    /**
     * 删除业主,根据id
     * @param id
     * @return
     */
    HttpResult removeOwner(int id);

    /**
     * 查询业主,根据id
     * @param id
     * @return
     */
    HttpResult getInfo(int id);
}
