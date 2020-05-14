package com.atguigu.controller;

import com.atguigu.entities.CommonResult;
import com.atguigu.entities.Payment;
import com.atguigu.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String res=paymentService.paymentinfo_ok(id);
        log.info(res);
        return  res;
    }
    @GetMapping("/hystrix/timeout/{id}")
    public String paymentTimeOut(@PathVariable("id") Integer id){
        String res=paymentService.paymentTimeOut(id);
        log.info(res);
        return  res;
    }
    @GetMapping("/hystrix/CircuitBreaker/{id}")
    public String CircuitBreaker(@PathVariable("id") Integer id){

        String res=paymentService.Breaker(id);
        log.info(res);
        return  res;
    }

}
