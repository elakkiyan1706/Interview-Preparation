package com.example.supermarketbillingsystem.service;

import com.example.supermarketbillingsystem.model.market;
import com.example.supermarketbillingsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public market addProduct(market product) {
        return repo.save(product);
    }

    public List<market> getAllProducts() {
        return repo.findAll();
    }

    public market getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public double calculateBill(int id, int qty) {
        market p = getProductById(id);
        if (p != null) {
            return p.getPrice() * qty;
        }
        return 0;
    }
}