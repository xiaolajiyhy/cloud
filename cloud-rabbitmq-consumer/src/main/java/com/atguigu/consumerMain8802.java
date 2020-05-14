package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class consumerMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(consumerMain8802.class,args);
    }
}
