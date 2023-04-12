package com.OnlineMedicalShop.repository;
import org.springframework.data.repository.CrudRepository;

import com.OnlineMedicalShop.model.User;



public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}