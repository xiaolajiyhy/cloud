package com.atguihu.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImp implements  PaymentService{


    @Override
    public String getPaymentById(Integer id) {
        return "ok fail";
    }

    @Override
    public String paymentTimeOut(Integer id) {
        return "TimeOut fail";
    }
}
