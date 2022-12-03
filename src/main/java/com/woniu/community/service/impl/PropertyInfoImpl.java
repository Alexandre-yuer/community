package com.woniu.community.service.impl;

import com.woniu.community.entity.PropertyInfo;
import com.woniu.community.mapper.PropertyInfoMapper;
import com.woniu.community.service.IPropertyInfoService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyInfoImpl implements IPropertyInfoService {

    @Autowired(required = false)
    private PropertyInfoMapper propertyInfoMapper;

    @Override
    public HttpResult getPropertyInfoList(String numbers, String status, int pageIndex, int pageSize) {
        List<PropertyInfo> propertyInfos = propertyInfoMapper.selectAll(numbers, status, (pageIndex - 1) * pageSize, pageSize);
        int count = propertyInfoMapper.count(numbers, status);
        HttpResult result = null;
        if(propertyInfos != null && propertyInfos.size() > 0){
            result = new HttpResult(propertyInfos,count,200,null);
        }else {
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }

    @Override
    public HttpResult savePropertyInfo(PropertyInfo propertyInfo) {
        int count = propertyInfoMapper.insertPropertyInfo(propertyInfo);
        HttpResult result = null;
        if(count>0){
            result = new HttpResult(null,0,200,"添加成功");
        }else {
            result = new HttpResult(null,0,500,"添加失败");
        }
        return result;
    }

    @Override
    public HttpResult updatePropertyInfo(PropertyInfo propertyInfo) {
        int count = propertyInfoMapper.updatePropertyInfo(propertyInfo);
        HttpResult result = null;
        if(count>0){
            result = new HttpResult(null,0,200,"修改成功");
        }else {
            result = new HttpResult(null,0,500,"修改失败");
        }
        return result;
    }

    @Override
    public HttpResult removePropertyInfo(int id) {
        int count = propertyInfoMapper.deletePropertyInfo(id);
        HttpResult result = null;
        if(count>0){
            result = new HttpResult(null,0,200,"删除成功");
        }else {
            result = new HttpResult(null,0,500,"删除失败");
        }
        return result;
    }

    @Override
    public HttpResult getInfo(int id) {
        PropertyInfo propertyInfo = propertyInfoMapper.selectById(id);
        HttpResult result = null;
        if(propertyInfo != null){
            result = new HttpResult(propertyInfo,0,200,null);
        }else {
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }
}
