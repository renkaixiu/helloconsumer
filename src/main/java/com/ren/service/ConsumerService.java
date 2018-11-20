package com.ren.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dongao on 2018/11/20.
 */
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String helloConsumer(){
        restTemplate.getForObject("http://hello-server/hello",String.class);
        return "hello-consumer finish !!!";
    }

    public String error(){
        return "error!!!!!!!!!!";
    }
}
