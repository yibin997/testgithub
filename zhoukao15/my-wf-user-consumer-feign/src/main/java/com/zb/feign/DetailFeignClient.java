package com.zb.feign;


import com.zb.entity.Detail;
import com.zb.entity.Houseinfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-provider")
public interface DetailFeignClient {


    @RequestMapping("/show/{projectId}")
    public String show(@PathVariable("projectId")Integer projectId);


    @RequestMapping("/add")
    public String addContract(@RequestBody Detail detail);
}
