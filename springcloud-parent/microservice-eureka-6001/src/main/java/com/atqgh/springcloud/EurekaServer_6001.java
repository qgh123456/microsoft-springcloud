package com.atqgh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 13:13 2019/4/2
 * @Modified By:
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6001.class, args);
    }
}
