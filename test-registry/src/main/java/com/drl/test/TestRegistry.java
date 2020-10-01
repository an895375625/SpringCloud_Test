package com.drl.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @date 2020/9/24 15:17
 */

@SpringBootApplication
@EnableEurekaServer
public class TestRegistry {
    public static void main(String[] args) {
        SpringApplication.run(TestRegistry.class,args);
    }
}
