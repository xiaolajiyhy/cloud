package com.atguihu.service;

import com.atguigu.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback = PaymentServiceImp.class)
public interface PaymentService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String getPaymentById(@PathVariable("id") Integer id);
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentTimeOut(@PathVariable("id") Integer id);
}
