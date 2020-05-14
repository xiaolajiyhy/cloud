package com.atguihu.controller;

import com.atguigu.entities.CommonResult;
import com.atguihu.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderFeignController {
    @Autowired
    PaymentService paymentService;
    @GetMapping("ok/{id}")
    public String getPaymentById(@PathVariable("id") Integer id){
        return paymentService.getPaymentById(id);
    }
    @GetMapping("TimeOut/{id}")
    public String TimeOut(@PathVariable("id") Integer id){
        return paymentService.paymentTimeOut(id);
    }

    public String fallback(){
        return "TimeOut Or Error";
    }
}
