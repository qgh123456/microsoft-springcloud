package com.atqgh.springCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 11:10 2019/4/2
 * @Modified By:
 **/
//会扫描指定包下面使用@FeignClient标识的接口
@EnableFeignClients(basePackages = "com.atqgh.springcloudApi.service")
@MapperScan("com.atqgh.springCloud.mapper")
@SpringBootApplication
public class Db01Application {
    public static void main(String[] args) {
        SpringApplication.run(Db01Application.class, args);
    }
}
