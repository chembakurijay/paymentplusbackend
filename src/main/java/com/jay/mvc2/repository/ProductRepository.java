// src/main/java/com/example/demo/repository/ProductRepository.java
package com.jay.mvc2.repository;

import com.jay.mvc2.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
