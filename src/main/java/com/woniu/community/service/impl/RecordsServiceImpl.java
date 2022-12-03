package com.woniu.community.service.impl;

import com.woniu.community.entity.Records;
import com.woniu.community.mapper.RecordsMapper;
import com.woniu.community.service.IRecordsService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordsServiceImpl implements IRecordsService {

    @Autowired(required = false)
    private RecordsMapper recordsMapper;

    @Override
    public HttpResult getRecordsList(String numbers, String type, int pageIndex, int pageSize) {
        List<Records> records = recordsMapper.selectAll(numbers, type, (pageIndex - 1) * pageSize, pageSize);
        int count = recordsMapper.count(numbers, type);
        HttpResult result = null;
        if(records != null && records.size() > 0){
            result = new HttpResult(records,count,200,null);
        }else{
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }

    @Override
    public HttpResult saveRecords(Records reords) {
        int count = recordsMapper.insertRecords(reords);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"添加成功");
        }else{
            result = new HttpResult(null,0,500,"添加失败");
        }
        return result;
    }

    @Override
    public HttpResult updateRecords(Records reords) {
        int count = recordsMapper.updateRecords(reords);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"修改成功");
        }else{
            result = new HttpResult(null,0,500,"修改失败");
        }
        return result;
    }

    @Override
    public HttpResult removeRecords(int id) {
        int count = recordsMapper.deleteRecords(id);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"删除成功");
        }else{
            result = new HttpResult(null,0,500,"删除失败");
        }
        return result;
    }

    @Override
    public HttpResult getInfo(int id) {
        Records records = recordsMapper.selectById(id);
        HttpResult result = null;
        if(records!=null){
            result = new HttpResult(records,0,200,null);
        }else{
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }
}
