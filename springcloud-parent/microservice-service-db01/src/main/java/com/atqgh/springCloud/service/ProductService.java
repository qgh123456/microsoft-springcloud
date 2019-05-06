package com.atqgh.springCloud.service;

//import com.atqgh.springcloud.entities.Product;

import com.atqgh.springCloud.entities.Product;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
