package com.datatech.cloud.datatechcontrollerupmsconsumer.com.datatech.cloud.controller;

import com.datatech.cloud.datatechcontrollerupmsconsumer.com.datatech.cloud.service.DatatechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DatatechController {
    @Autowired
    DatatechService datatechService;

    @RequestMapping(value="/hi")
    public String datatechControllerIndex(@RequestParam String name){
        return datatechService.hiService(name);
    }
}
