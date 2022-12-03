package com.woniu.community.service.impl;

import com.woniu.community.entity.House;
import com.woniu.community.mapper.HouseMapper;
import com.woniu.community.service.IHouseService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements IHouseService {

    @Autowired(required = false)
    private HouseMapper houseMapper;

    @Override
    public HttpResult getHouseList(String number, int pageIndex, int pageSize) {
        List<House> houses = houseMapper.selectAll(number, (pageIndex - 1) * pageSize, pageSize);
        int count = houseMapper.count(number);
        HttpResult result = null;
        if( houses != null && houses.size()>0){
            result = new HttpResult(houses,count,200,null);
        }else {
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }

    @Override
    public HttpResult saveHouse(House house) {
        int count = houseMapper.insertHouse(house);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"添加成功");
        }else{
            result = new HttpResult(null,0,500,"添加失败");
        }
        return result;
    }

    @Override
    public HttpResult updateHouse(House house) {
        int count = houseMapper.updateHouse(house);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"修改成功");
        }else{
            result = new HttpResult(null,0,500,"修改失败");
        }
        return result;
    }

    @Override
    public HttpResult removeHouse(int id) {
        int count = houseMapper.deleteHouse(id);
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
        House house = houseMapper.selectById(id);
        HttpResult result = null;
        if(house != null){
            result = new HttpResult(house,0,200,null);
        }else{
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }
}
