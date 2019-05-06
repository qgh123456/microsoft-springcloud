package com.atqgh.springCloud.mapper;


//import com.atqgh.springcloud.entities.Product;

import com.atqgh.springCloud.entities.Product;

import java.util.List;

/**
 * @Auther: guohuiqi
 */
//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}