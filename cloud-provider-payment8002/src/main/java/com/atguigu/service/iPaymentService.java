package com.atguigu.service;

import com.atguigu.entities.Payment;

public interface iPaymentService  {
    public int create(Payment payment);
    public  Payment getPayment(Long id);
}
