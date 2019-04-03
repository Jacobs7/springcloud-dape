package com.datatech.cloud.datatechadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DatatechAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatechAdminClientApplication.class, args);
    }

}
