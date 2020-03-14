package com.hugonsantos.testapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugonsantos.testapi.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
