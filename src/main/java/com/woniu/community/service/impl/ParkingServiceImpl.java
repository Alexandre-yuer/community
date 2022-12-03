package com.woniu.community.service.impl;

import com.woniu.community.entity.Parking;
import com.woniu.community.mapper.ParkingMapper;
import com.woniu.community.service.IParkingService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingServiceImpl implements IParkingService {

    @Autowired(required = false)
    private ParkingMapper parkingMapper;

    @Override
    public HttpResult getParkingList(String numbers, int pageIndex, int pageSize) {
        List<Parking> parkings = parkingMapper.selectAll(numbers, (pageIndex - 1) * pageSize, pageSize);
        int count = parkingMapper.count(numbers);
        HttpResult result = null;
        if(parkings != null && parkings.size() > 0){
            result = new HttpResult(parkings,count,200,null);
        }else {
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }

    @Override
    public HttpResult saveParking(Parking parking) {
        int count = parkingMapper.insertParking(parking);
        HttpResult result =null;
        if(count > 0){
            result = new HttpResult(null,0,200,"添加成功");
        }else {
            result = new HttpResult(null,0,500,"添加失败");
        }
        return result;
    }

    @Override
    public HttpResult updateParking(Parking parking) {
        int count = parkingMapper.updateParking(parking);
        HttpResult result =null;
        if(count > 0){
            result = new HttpResult(null,0,200,"修改成功");
        }else {
            result = new HttpResult(null,0,500,"修改失败");
        }
        return result;
    }

    @Override
    public HttpResult removeParking(int id) {
        int count = parkingMapper.deleteParking(id);
        HttpResult result =null;
        if(count > 0){
            result = new HttpResult(null,0,200,"删除成功");
        }else {
            result = new HttpResult(null,0,500,"删除失败");
        }
        return result;
    }

    @Override
    public HttpResult getInfo(int id) {
        Parking parking = parkingMapper.selectById(id);
        HttpResult result =null;
        if(parking != null){
            result = new HttpResult(parking,0,200,null);
        }else {
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }
}
