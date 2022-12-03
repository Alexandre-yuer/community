package com.woniu.community.controller;

import com.woniu.community.entity.PropertyInfo;
import com.woniu.community.service.IPropertyInfoService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/property_info")
@CrossOrigin(origins = "*")
public class PropertyInfoController {

    @Autowired
    private IPropertyInfoService propertyInfoService;

    @RequestMapping("/list")
    public HttpResult getPropertyInfoList(String numbers, String status, int pageIndex, int pageSize){
        return propertyInfoService.getPropertyInfoList(numbers,status,pageIndex,pageSize);
    }

    @PostMapping("/add")
    public HttpResult savePropertyInfo(@RequestBody PropertyInfo propertyInfo){
        return propertyInfoService.savePropertyInfo(propertyInfo);
    }

    @PostMapping("/update")
    public HttpResult updatePropertyInfo(@RequestBody PropertyInfo propertyInfo){
        return propertyInfoService.updatePropertyInfo(propertyInfo);
    }

    @RequestMapping("/remove")
    public HttpResult removePropertyInfo(int id){
        return propertyInfoService.removePropertyInfo(id);
    }

    @RequestMapping("/info")
    public HttpResult getInfo(int id){
        return propertyInfoService.getInfo(id);
    }
}
