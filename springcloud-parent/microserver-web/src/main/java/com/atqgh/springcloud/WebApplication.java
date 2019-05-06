package com.atqgh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 13:37 2019/4/2
 * @Modified By:
 **/
@SpringBootApplication
@EnableFeignClients(basePackages = "com.atqgh.springcloudApi.service")
@ComponentScan(basePackages = {"com.atqgh.springcloudApi.service.impl"} )
@EnableEurekaClient
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
