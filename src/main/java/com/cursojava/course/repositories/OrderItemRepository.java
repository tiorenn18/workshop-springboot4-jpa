package com.cursojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
    
}
