package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class ListenerController {
    @Value("${server.port}")
    private  String port;
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println(message.getPayload()+"  prot :"+ port);
    }

}
