package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atguigu.dao")
@SpringBootApplication
public class springcloudPayment {
    public static void main(String[] args) {
        SpringApplication.run(springcloudPayment.class,args);
    }
}
