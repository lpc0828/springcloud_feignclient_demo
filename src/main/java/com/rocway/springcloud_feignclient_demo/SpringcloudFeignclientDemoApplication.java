package com.rocway.springcloud_feignclient_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.rocway.springcloud_feignclient_demo.feign.client"})
@SpringBootApplication
public class SpringcloudFeignclientDemoApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(SpringcloudFeignclientDemoApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

