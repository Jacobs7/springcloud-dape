package com.datatech.cloud.datatechgatewayone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DatatechGatewayOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatechGatewayOneApplication.class, args);
    }

}
