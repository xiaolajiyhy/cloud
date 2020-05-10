package com.atguigu.service;

import com.atguigu.dao.PaymentDao;
import com.atguigu.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService implements iPaymentService{
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment){
        return  paymentDao.create(payment);
    }
    public  Payment getPayment( Long id){
        return  paymentDao.getPayment(id);
    }


}
