package com.example.sericefeign.service;


import com.example.sericefeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-A",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceA {


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

