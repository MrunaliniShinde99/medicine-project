package com.OnlineMedicalShop.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.OnlineMedicalShop.model.Signup;


public interface SignupRepository extends JpaRepository<Signup,Integer>{
    
	//Optional<Signup> findByUsername(String username);

	//Boolean existsByUsername(String username);

	
}
