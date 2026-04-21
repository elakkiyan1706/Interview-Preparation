package com.example.supermarketbillingsystem.controller;

import com.example.supermarketbillingsystem.model.market;
import com.example.supermarketbillingsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class product {

    @Autowired
    ProductService service;

    @PostMapping("/add")
    public market addProduct(@RequestBody market product) {
        return service.addProduct(product);
    }

    @GetMapping("/products")
    public List<market> getProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/bill")
    public String generateBill(@RequestParam int id, @RequestParam int qty) {
        double total = service.calculateBill(id, qty);
        return "Total Bill = " + total;
    }
}