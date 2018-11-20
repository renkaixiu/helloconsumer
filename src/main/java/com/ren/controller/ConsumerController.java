package com.ren.controller;

import com.ren.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dongao on 2018/11/20.
 */
@RestController
public class ConsumerController {

    @Autowired
    //RestTemplate restTemplate;
    ConsumerService consumerService;

    @RequestMapping("/hello-consumer")
    public String helloConsumer(){
        return consumerService.helloConsumer();
    }
}
