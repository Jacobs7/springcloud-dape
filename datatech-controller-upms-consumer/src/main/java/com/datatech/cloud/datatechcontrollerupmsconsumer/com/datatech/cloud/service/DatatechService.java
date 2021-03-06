package com.datatech.cloud.datatechcontrollerupmsconsumer.com.datatech.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DatatechService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://CONFIG-CLIENT/hi?name="+name,String.class);
    }
}
