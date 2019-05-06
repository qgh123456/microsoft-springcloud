package com.atqgh.springcloudApi.service.impl;

import com.atqgh.springcloudApi.entities.Product;
import com.atqgh.springcloudApi.service.ProductClientService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 11:19 2019/4/2
 * @Modified By:
 * 这个类中要加上日志的信息，回来添加一下模块
 **/
@Component
public class ProductServiceFallBack implements ProductClientService {

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id=" + id + "无数据--feign&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
