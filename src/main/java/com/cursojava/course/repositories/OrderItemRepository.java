package com.cursojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.course.entities.OrderItem;
import com.cursojava.course.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPk> {
    
}
