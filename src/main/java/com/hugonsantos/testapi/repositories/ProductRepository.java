package com.hugonsantos.testapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugonsantos.testapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
