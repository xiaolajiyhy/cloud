package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class springcloudPayment8002 {
    public static void main(String[] args) {
        SpringApplication.run(springcloudPayment8002.class,args);
    }
}
