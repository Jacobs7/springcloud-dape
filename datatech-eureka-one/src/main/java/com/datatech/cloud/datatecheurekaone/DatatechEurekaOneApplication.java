package com.datatech.cloud.datatecheurekaone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DatatechEurekaOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatechEurekaOneApplication.class, args);
    }

}
