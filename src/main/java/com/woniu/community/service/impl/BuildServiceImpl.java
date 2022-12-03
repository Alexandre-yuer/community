package com.woniu.community.service.impl;

import com.woniu.community.entity.Build;
import com.woniu.community.entity.User;
import com.woniu.community.mapper.BuildMapper;
import com.woniu.community.service.IBuildService;
import com.woniu.community.utils.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildServiceImpl implements IBuildService {

    @Autowired(required = false)
    private BuildMapper buildMapper;

    @Override
    public HttpResult getBuilds(int pageIndex, int pageSize) {
        List<Build> builds = buildMapper.selectAll((pageIndex - 1) * pageSize, pageSize);
        int count = buildMapper.selectCount();
        HttpResult result = null;
        if(builds != null && builds.size() > 0){
            result =  new HttpResult(builds,count,200,null);
        }else {
            result =  new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }

    @Override
    public HttpResult addBuild(Build build) {
        int count = buildMapper.insertBuild(build);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"添加成功");
        }else {
            result = new HttpResult(null,0,500,"添加失败");
        }
        return result;
    }

    @Override
    public HttpResult removeBuild(int id) {
        int count = buildMapper.deleteBuild(id);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"删除成功");
        }else {
            result = new HttpResult(null,0,500,"删除失败");
        }
        return result;
    }

    @Override
    public HttpResult updateBuild(Build build) {
        int count = buildMapper.updateBuild(build);
        HttpResult result = null;
        if(count > 0){
            result = new HttpResult(null,0,200,"修改成功");
        }else {
            result = new HttpResult(null,0,500,"修改失败");
        }
        return result;
    }

    @Override
    public HttpResult getBuildInfo(int id) {
        Build build = buildMapper.selectBuildById(id);
        HttpResult result = null;
        if(build != null){
            result = new HttpResult(build,0,200,null);
        }else {
            result = new HttpResult(null,0,500,"没有更多数据");
        }
        return result;
    }
}
