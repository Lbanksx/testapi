package com.hugonsantos.testapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugonsantos.testapi.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
