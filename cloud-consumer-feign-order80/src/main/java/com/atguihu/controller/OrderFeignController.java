package com.atguihu.controller;

import com.atguigu.entities.CommonResult;
import com.atguihu.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderFeignController {
    @Autowired
    PaymentService paymentService;
    @GetMapping("/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return paymentService.getPaymentById(id);
    }
}
