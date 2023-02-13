package com.wj.mall.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MallWmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallWmsApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
