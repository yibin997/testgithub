package com.zb.service;

import com.alibaba.fastjson.JSON;
import com.zb.entity.Detail;
import com.zb.entity.Houseinfo;
import com.zb.mapper.DetailMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class DetailService {

    @Resource
    DetailMapper detailMapper;

    @RequestMapping("/show/{projectId}")
    public String show(@PathVariable("projectId")Integer projectId) {
        
        return JSON.toJSONString(detailMapper.getAll(projectId));

    }



    @RequestMapping("/add")
    public String addContract(@RequestBody Detail detail) {
        if (detailMapper.add(detail) == 1) {
            return "true";
        }
        return "false";

    }
}
