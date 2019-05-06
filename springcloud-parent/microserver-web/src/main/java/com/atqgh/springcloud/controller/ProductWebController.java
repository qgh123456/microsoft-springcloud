package com.atqgh.springcloud.controller;


import com.atqgh.springcloudApi.entities.Product;
import com.atqgh.springcloudApi.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 13:29 2019/4/2
 * @Modified By:
 **/
@Controller
public class ProductWebController {

    @Autowired
    ProductClientService productService;

    @RequestMapping("/product/list")
    @ResponseBody
    List<Product> list() {
        return productService.list();
    }
}
