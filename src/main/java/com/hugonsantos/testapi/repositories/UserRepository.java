package com.hugonsantos.testapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugonsantos.testapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
