package com.tcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcg.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByUsername(String username);

}
