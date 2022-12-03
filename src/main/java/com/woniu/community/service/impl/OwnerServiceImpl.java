package com.woniu.community.service.impl;

import com.woniu.community.entity.House;
import com.woniu.community.entity.Owner;
import com.woniu.community.mapper.OwnerMapper;
import com.woniu.community.service.IOwnerService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements IOwnerService {

    @Autowired(required = false)
    private OwnerMapper ownerMapper;

    @Override
    public HttpResult getOwnerList(String tel,String identity,int pageIndex, int pageSize) {
        List<Owner> owners = ownerMapper.selectAll(tel,identity,(pageIndex - 1) * pageSize, pageSize);
        int count = ownerMapper.count(tel,identity);
        HttpResult result = null;
        if(owners != null && owners.size() > 0){
            result = new HttpResult(owners,count,200,null);
        }else {
            result = new HttpResult(owners,count,500,"没有更多数据");
        }
        return result;
    }

    @Override
    public HttpResult saveOwner(Owner owner) {
        int count = ownerMapper.insertOwner(owner);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"添加成功");
        }else {
            result = new HttpResult(null,0,500,"添加失败");
        }
        return result;
    }

    @Override
    public HttpResult updateOwner(Owner owner) {
        int count = ownerMapper.updateOwner(owner);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"修改成功");
        }else {
            result = new HttpResult(null,0,500,"修改失败");
        }
        return result;
    }

    @Override
    public HttpResult removeOwner(int id) {
        int count = ownerMapper.deleteOwner(id);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"删除成功");
        }else {
            result = new HttpResult(null,0,500,"删除失败");
        }
        return result;
    }

    @Override
    public HttpResult getInfo(int id) {
        Owner owner = ownerMapper.selectById(id);
        HttpResult result = null;
        if( owner != null){
            result = new HttpResult(owner,0,200,null);
        }else {
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }
}
