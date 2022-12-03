package com.woniu.community.service;

import com.woniu.community.entity.PropertyInfo;
import com.woniu.community.entity.Records;
import com.woniu.community.utils.HttpResult;

public interface IPropertyInfoService {
    /**
     * 获取物业收费列表
     * @param numbers 房间号
     * @param status 缴费状态
     * @param pageIndex 页码
     * @param pageSize 每页条数
     * @return
     */
    HttpResult getPropertyInfoList(String numbers, String status, int pageIndex, int pageSize);
    /**
     * 添加物业收费信息
     * @param propertyInfo
     * @return
     */
    HttpResult savePropertyInfo(PropertyInfo propertyInfo);

    /**
     * 修改物业收费信息
     * @param propertyInfo
     * @return
     */
    HttpResult updatePropertyInfo(PropertyInfo propertyInfo);

    /**
     * 删除物业收费信息,根据id
     * @param id
     * @return
     */
    HttpResult removePropertyInfo(int id);

    /**
     * 查询物业收费信息,根据id
     * @param id
     * @return
     */
    HttpResult getInfo(int id);
}
