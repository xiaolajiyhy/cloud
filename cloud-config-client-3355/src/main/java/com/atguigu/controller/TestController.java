package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //刷新容器中scope的bean，热刷新
public class TestController {
    @Value("${config.info}")
    String property;
    @RequestMapping("/test")
    public String test(){
        return  property;
    }
}
