package com.setec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.setec.models.User;
import com.setec.repositorys.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public List<User> getUserAll() {
		return userRepository.findAll();
	}
	public ResponseEntity<Object> save(User user) {
		userRepository.save(user);
		return new ResponseEntity<Object>("User created", HttpStatus.CREATED);
	}

}
