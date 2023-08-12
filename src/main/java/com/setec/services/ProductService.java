package com.setec.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.setec.models.Product;
import com.setec.repositorys.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public ResponseEntity<Object> save(Product product) {
		try {
			productRepository.save(product);
			return new ResponseEntity<Object>("Product created successfully!!!",HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
