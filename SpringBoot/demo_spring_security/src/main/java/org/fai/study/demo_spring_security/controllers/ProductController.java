package org.fai.study.demo_spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @GetMapping("/list")
    public List<String> GetProducts()
    {
        List<String> products = new ArrayList<>();
        products.add("Product 1");
        products.add("Product 2");
        return products;
    }
}
