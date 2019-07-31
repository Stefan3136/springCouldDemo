package com.example.sericefeign.service.impl;

import com.example.sericefeign.service.SchedualServiceA;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceA {



    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
