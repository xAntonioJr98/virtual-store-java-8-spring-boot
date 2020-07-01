package com.torresantonio.virtualstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torresantonio.virtualstore.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
