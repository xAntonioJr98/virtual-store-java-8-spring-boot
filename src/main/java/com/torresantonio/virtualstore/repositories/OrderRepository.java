package com.torresantonio.virtualstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torresantonio.virtualstore.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
