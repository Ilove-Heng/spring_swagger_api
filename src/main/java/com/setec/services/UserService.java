package com.setec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}
	public ResponseEntity<Object> deleteUserById(Integer id) {
		User user = userRepository.findUserById(id);
		if(user == null) {
			throw new RuntimeException("User not found for id :" + id);
		}
		userRepository.delete(user);
		return new ResponseEntity<Object>("User deleted :" + id,HttpStatus.OK);
	}
	public ResponseEntity<Object> updateUserById(User user) {
		User userId = userRepository.findUserById(user.getId());
		if(userId == null) {
			throw new RuntimeException("No found ID :" + user.getId());
		}
		userRepository.save(user);
		return new ResponseEntity<Object>("User updated", HttpStatus.OK);
	}

}
