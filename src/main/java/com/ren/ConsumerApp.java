package com.ren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dongao on 2018/11/20.
 * 这里也要用到@EnableDiscoveryClient， 让服务使用eureka服务器， 实现服务注册和发现
 */
/*@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
*/
@SpringCloudApplication
public class ConsumerApp {

    //@Bean 应用在方法上，用来将方法返回值设为为bean
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
