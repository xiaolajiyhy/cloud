package com.atguigu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public  String paymentinfo_ok(Integer id){
        return  Thread.currentThread().getName()+"info_ok,id"+id+"\t"+"0.0";
    }
    @HystrixCommand(fallbackMethod = "TimeoutfallbackMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    //超时的应急处理，时间2秒，自定应急措施
    public  String paymentTimeOut(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  Thread.currentThread().getName()+"TimeOut"+id+"\t"+"3s";
    }
    public  String TimeoutfallbackMethod(Integer id){

        return  Thread.currentThread().getName()+"TimeoutfallbackMethod"+id+"\t"+"3s";
    }
    @HystrixCommand(fallbackMethod = "TimeoutfallbackMethod",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000")
    })
    public  String Breaker(Integer id){
        if(id<0){
            throw new RuntimeException();
        }
        return  "ok";
    }

}
