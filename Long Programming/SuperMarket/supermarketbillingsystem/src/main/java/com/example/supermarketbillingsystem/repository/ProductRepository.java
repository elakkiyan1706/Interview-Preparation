package com.example.supermarketbillingsystem.repository;

import com.example.supermarketbillingsystem.model.market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<market, Integer> {
}