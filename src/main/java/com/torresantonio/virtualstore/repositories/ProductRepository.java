package com.torresantonio.virtualstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torresantonio.virtualstore.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
