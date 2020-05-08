package com.atguigu.dao;

import com.atguigu.entities.Payment;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface PaymentDao extends BaseMapper<Payment> {
    public int create(Payment payment);
    public  Payment getPayment(@Param("id") Long id);
}
