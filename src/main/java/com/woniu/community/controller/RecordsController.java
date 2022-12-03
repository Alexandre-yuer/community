package com.woniu.community.controller;

import com.woniu.community.entity.Records;
import com.woniu.community.service.IRecordsService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/records")
@CrossOrigin(origins = "*")
public class RecordsController {

    @Autowired
    private IRecordsService recordsService;

    @RequestMapping("/list")
    public HttpResult getRecordsList(String numbers, String type, int pageIndex, int pageSize){
        return recordsService.getRecordsList(numbers,type,pageIndex,pageSize);
    }

    @PostMapping("/add")
    public HttpResult saveRecords(@RequestBody Records reords){
        return recordsService.saveRecords(reords);
    }

    @PostMapping("/update")
    public HttpResult updateRecords(@RequestBody Records reords){
        return  recordsService.updateRecords(reords);
    }

    @RequestMapping("/remove")
    public HttpResult removeRecords(int id){
        return recordsService.removeRecords(id);
    }

    @RequestMapping("/info")
    public HttpResult getInfo(int id){
        return recordsService.getInfo(id);
    }
}
