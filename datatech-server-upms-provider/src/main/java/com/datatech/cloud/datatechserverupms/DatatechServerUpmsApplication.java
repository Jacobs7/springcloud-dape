package com.datatech.cloud.datatechserverupms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RefreshScope
public class DatatechServerUpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatechServerUpmsApplication.class, args);
    }

    @Value("${hi}")
    private String hi;
    @RequestMapping("/hi")
    public String sayHello(){
        return "hello datatech !"+hi+";";
    }

    @Value("${server.port}")
    private String port;
    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
