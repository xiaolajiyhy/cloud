package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureKaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EureKaMain7002.class,args);
    }
}
