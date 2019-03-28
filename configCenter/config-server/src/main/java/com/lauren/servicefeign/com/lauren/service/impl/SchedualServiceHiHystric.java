package com.lauren.servicefeign.com.lauren.service.impl;

import com.lauren.servicefeign.com.lauren.service.SchedualServiceHi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sayHiFromClientOne error!";
    }

    @Override
    public String getUsername(String username) {
        return "getUsername ERROR!";
    }
}
