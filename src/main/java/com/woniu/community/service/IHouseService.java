package com.woniu.community.service;

import com.woniu.community.entity.House;
import com.woniu.community.utils.HttpResult;

public interface IHouseService {
    /**
     * 获取房屋列表
     * @param number 房屋号(null表示查询全部)
     * @param pageIndex 页码
     * @param pageSize 每页条数
     * @return
     */
    HttpResult getHouseList(String number,int pageIndex,int pageSize);

    /**
     * 添加房屋
     * @param house
     * @return
     */
    HttpResult saveHouse(House house);

    /**
     * 修改房屋
     * @param house
     * @return
     */
    HttpResult updateHouse(House house);

    /**
     * 删除房屋,根据id
     * @param id
     * @return
     */
    HttpResult removeHouse(int id);

    /**
     * 查询房屋,根据id
     * @param id
     * @return
     */
    HttpResult getInfo(int id);
}
