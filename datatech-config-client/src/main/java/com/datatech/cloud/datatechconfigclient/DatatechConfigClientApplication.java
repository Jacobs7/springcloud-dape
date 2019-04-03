package com.datatech.cloud.datatechconfigclient;

import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class DatatechConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatechConfigClientApplication.class, args);
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
