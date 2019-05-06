package com.atqgh.springcloudApi.service;


import com.atqgh.springcloudApi.entities.Product;
import com.atqgh.springcloudApi.service.impl.ProductServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 11:17 2019/4/2
 * @Modified By:
 **/
@FeignClient(value = "microservice-product", fallback = ProductServiceFallBack.class) //指定调用的微服务名称
public interface ProductClientService {

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    boolean add(@RequestBody Product product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();
}
