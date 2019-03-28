package com.lauren.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService
{
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name)
    {
        System.out.println("this consumer service hello service executed!");
        return restTemplate.getForObject("http://provider-service/hi?name=" + name, String.class);
    }
}
