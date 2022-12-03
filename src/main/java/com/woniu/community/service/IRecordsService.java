package com.woniu.community.service;

import com.woniu.community.entity.Records;
import com.woniu.community.utils.HttpResult;

public interface IRecordsService {
    /**
     * 获取抄表信息列表
     * @param numbers 门牌号
     * @param type 水费类型
     * @param pageIndex 页码
     * @param pageSize 每页条数
     * @return
     */
    HttpResult getRecordsList(String numbers,String type, int pageIndex, int pageSize);
    /**
     * 添加抄表信息
     * @param reords
     * @return
     */
    HttpResult saveRecords(Records reords);

    /**
     * 修改抄表信息
     * @param reords
     * @return
     */
    HttpResult updateRecords(Records reords);

    /**
     * 删除抄表信息,根据id
     * @param id
     * @return
     */
    HttpResult removeRecords(int id);

    /**
     * 查询抄表信息,根据id
     * @param id
     * @return
     */
    HttpResult getInfo(int id);
}
