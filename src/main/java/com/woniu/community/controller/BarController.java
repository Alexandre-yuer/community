package com.woniu.community.controller;

import com.woniu.community.service.IBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/bar")
@CrossOrigin(origins = "*")
public class BarController {

    @Autowired
    private IBarService barService;

    @RequestMapping("/list")
    public Map getBar(){
        return barService.getBar();
    }
}
