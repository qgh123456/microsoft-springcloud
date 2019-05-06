package com.atqgh.springCloud.service.impl;


import com.atqgh.springCloud.entities.Product;
import com.atqgh.springCloud.mapper.ProductMapper;
import com.atqgh.springCloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import com.atqgh.springcloud.entities.Product;

/**
 * @Auther: guohuiqi
 */
@Service //一定不要少了
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }

}
