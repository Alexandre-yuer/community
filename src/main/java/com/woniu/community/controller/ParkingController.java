package com.woniu.community.controller;

import com.woniu.community.entity.Parking;
import com.woniu.community.service.IParkingService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking")
@CrossOrigin(origins = "*")
public class ParkingController {

    @Autowired
    private IParkingService parkingService;

    @RequestMapping("/list")
    public HttpResult getParkingList(String numbers, int pageIndex, int pageSize){
        return parkingService.getParkingList(numbers, pageIndex, pageSize);
    }

    @PostMapping("/add")
    public HttpResult saveParking(@RequestBody Parking parking){
        return parkingService.saveParking(parking);
    }

    @PostMapping("/update")
    public HttpResult updateParking(@RequestBody Parking parking){
        return parkingService.updateParking(parking);
    }

    @RequestMapping("/remove")
    public HttpResult removeParking(int id){
        return parkingService.removeParking(id);
    }

    @RequestMapping("/info")
    public HttpResult getInfo(int id){
        return parkingService.getInfo(id);
    }
}
