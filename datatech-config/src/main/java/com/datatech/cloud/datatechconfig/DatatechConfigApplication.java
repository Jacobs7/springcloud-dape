package com.datatech.cloud.datatechconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication    //Boot项目
@EnableEurekaClient       //服务发现
@EnableConfigServer       //配置中心服务
public class DatatechConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatechConfigApplication.class, args);
    }

}
