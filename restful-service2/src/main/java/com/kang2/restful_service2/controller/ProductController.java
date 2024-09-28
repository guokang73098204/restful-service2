package com.kang2.restful_service2.controller;

import com.kang2.restful_service2.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
/*    @GetMapping("/")
    public String hello() {
        return "hello world1234";
    }*/

    @PostMapping("/product")
    public String createProduct(@RequestBody final Product product) {
        System.out.println(product);
        return "1235";
    }
}
