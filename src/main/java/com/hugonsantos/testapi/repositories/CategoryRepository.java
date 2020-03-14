package com.hugonsantos.testapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugonsantos.testapi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
