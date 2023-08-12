package com.setec.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.setec.models.Product;
import com.setec.services.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {
	@Autowired
	ProductService productService;
	@PostMapping("product")
	public ResponseEntity<Object>save(@RequestBody Product product) {
		return productService.save(product);
	}
}
