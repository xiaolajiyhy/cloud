package com.atguihu.service;

import com.atguigu.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentService {
    @GetMapping("/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

}
