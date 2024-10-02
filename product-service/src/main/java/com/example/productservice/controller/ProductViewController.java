package com.example.productservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductViewController {

    @GetMapping("/addProduct")
    public String showAddProductForm() {
        return "addProduct"; // This will look for addProduct.html in the resources/static directory
    }

    // Additional mappings for products can be added here
}
