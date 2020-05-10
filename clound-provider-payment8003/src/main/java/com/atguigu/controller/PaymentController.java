package com.atguigu.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private  String serverPort;
    @RequestMapping("/payment/zk")
    public String payment(){
        return "springcloud with zookepper"+serverPort+ UUID.randomUUID().toString();
    }
}
