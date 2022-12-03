package com.woniu.community.service.impl;

import com.woniu.community.entity.Bar;
import com.woniu.community.mapper.BarMapper;
import com.woniu.community.service.IBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BarServiceImpl implements IBarService {

    @Autowired(required = false)
    private BarMapper barMapper;

    @Override
    public Map getBar() {
        List<Bar> bars = barMapper.getBars();

//        List<String> names = bars.stream().map(Bar::getName).collect(Collectors.toList());

        List<String> names = new ArrayList<>();
        bars.forEach(e->{
            names.add(e.getName());
        });

        List<Integer> nums = new ArrayList<>();
        bars.forEach(e->{
            nums.add(e.getNums());
        });

        Map map = new HashMap();
        map.put("names",names);
        map.put("nums",nums);

        return map;
    }
}
