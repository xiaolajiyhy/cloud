package com.atguigu.controller;

import com.atguigu.entities.CommonResult;
import com.atguigu.entities.Payment;
import com.atguigu.service.iPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

  @Autowired
  private iPaymentService paymentService;
    @PostMapping(value = "/create")

    public  CommonResult create(@RequestBody Payment payment){
       int result=paymentService.create(payment);

       log.info("result"+payment.getSerial());
       if(result>0){
           return new CommonResult(200,"succ",result);
       }else {
           return new CommonResult(444,"fail",null);
       }
    }
    @GetMapping("/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPayment(id);
        if(payment==null){
            return  new CommonResult(444,"fail",null);
        }else {
            return  new CommonResult(200,"success",payment);
        }
    }

}
