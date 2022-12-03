package com.woniu.community.controller;

import com.woniu.community.entity.Build;
import com.woniu.community.entity.vo.BuildVO;
import com.woniu.community.service.IBuildService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/build")
@CrossOrigin(origins = "*")
public class BuildController {

    @Autowired
    private IBuildService buildService;

    @RequestMapping("/list")
    public HttpResult getBuilds(int pageIndex, int pageSize){
        return buildService.getBuilds(pageIndex,pageSize);
    }

    @RequestMapping("/add")
    public HttpResult addBuild(@RequestBody BuildVO buildVO){
        Build build = new Build();
        build.setNumbers(buildVO.getNumbers());
        build.setUnits(buildVO.getUnits());
        return buildService.addBuild(build);
    }

    @RequestMapping("/remove")
    public HttpResult removeBuild(int id){
        return buildService.removeBuild(id);
    }

    @RequestMapping("/update")
    public HttpResult updateBuild(@RequestBody Build build){
        return buildService.updateBuild(build);
    }

    @RequestMapping("/info")
    public HttpResult getBuildInfo(int id){
        return buildService.getBuildInfo(id);
    }
}
