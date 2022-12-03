package com.woniu.community.service;

import com.woniu.community.entity.Owner;
import com.woniu.community.entity.Parking;
import com.woniu.community.utils.HttpResult;

public interface IParkingService {
    /**
     * 获取车位信息列表
     * @param pageIndex 页码
     * @param pageSize 每页条数
     * @return
     */
    HttpResult getParkingList(String numbers,int pageIndex, int pageSize);

    /**
     * 添加车位信息
     * @param parking
     * @return
     */
    HttpResult saveParking(Parking parking);

    /**
     * 修改车位信息
     * @param parking
     * @return
     */
    HttpResult updateParking(Parking parking);

    /**
     * 删除业主,根据id
     * @param id
     * @return
     */
    HttpResult removeParking(int id);

    /**
     * 查询业主,根据id
     * @param id
     * @return
     */
    HttpResult getInfo(int id);
}
