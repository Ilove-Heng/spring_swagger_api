package com.setec.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setec.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
