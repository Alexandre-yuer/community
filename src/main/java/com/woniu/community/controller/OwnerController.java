package com.woniu.community.controller;

import com.woniu.community.entity.Owner;
import com.woniu.community.service.IOwnerService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owner")
@CrossOrigin(origins = "*")
public class OwnerController {

    @Autowired
    private IOwnerService ownerService;

    @RequestMapping("/list")
    public HttpResult getOwnerList(String tel,String identity,int pageIndex, int pageSize){
        return ownerService.getOwnerList(tel,identity,pageIndex,pageSize);
    }

    @PostMapping("/add")
    public HttpResult saveOwner(@RequestBody Owner owner){
        return ownerService.saveOwner(owner);
    }

    @PostMapping("/update")
    public HttpResult updateOwner(@RequestBody Owner owner){
        return ownerService.updateOwner(owner);
    }

    @RequestMapping("/remove")
    public HttpResult removeOwner(int id){
        return ownerService.removeOwner(id);
    }

    @RequestMapping("/info")
    public HttpResult getInfo(int id){
        return ownerService.getInfo(id);
    }
}
