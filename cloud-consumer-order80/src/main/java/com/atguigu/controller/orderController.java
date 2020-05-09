package com.atguigu.controller;

import com.atguigu.entities.CommonResult;
import com.atguigu.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class orderController {

    @Autowired
    private RestTemplate restTemplate;
    private  static final  String PAYMENT_URL="http://localhost:8089/payment";
    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody  Payment payment){
        return  restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @GetMapping("/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return  restTemplate.getForObject(PAYMENT_URL+"/"+id,CommonResult.class);
    }
}
