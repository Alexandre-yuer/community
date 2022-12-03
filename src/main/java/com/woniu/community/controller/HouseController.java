package com.woniu.community.controller;

import com.woniu.community.entity.House;
import com.woniu.community.service.IHouseService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/house")
@CrossOrigin(origins = "*")
public class HouseController {

    @Autowired
    private IHouseService houseService;

    @RequestMapping("/list")
    public HttpResult getHouseList(String number, int pageIndex, int pageSize){
        return houseService.getHouseList(number,pageIndex,pageSize);
    }

    @PostMapping("/add")
    public HttpResult saveHouse(@RequestBody House house){
        return houseService.saveHouse(house);
    }

    @PostMapping("/update")
    public HttpResult updateHouse(@RequestBody House house){
        return houseService.updateHouse(house);
    }

    @RequestMapping("/remove")
    public HttpResult removeHouse(int id){
        return houseService.removeHouse(id);
    }

    @RequestMapping("/info")
    public HttpResult getInfo(int id){
        return houseService.getInfo(id);
    }
}
