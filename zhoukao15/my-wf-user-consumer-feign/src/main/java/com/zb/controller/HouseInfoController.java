package com.zb.controller;

import com.zb.entity.Detail;
import com.zb.entity.Houseinfo;
import com.zb.feign.DetailFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HouseInfoController {
@Resource
DetailFeignClient detailFeignClient;


    @RequestMapping("/show/{projectId}")
    public String show(@PathVariable("projectId")Integer projectId) {
            return  detailFeignClient.show(projectId);
    }

    @RequestMapping("/add")
    public String addContract( Detail detail) {
            return  detailFeignClient.addContract(detail);
    }
}
