package com.datatech.cloud.datatechconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableConfigServer
@SpringBootApplication
@RefreshScope
public class DatatechConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatechConfigApplication.class, args);
    }

}
