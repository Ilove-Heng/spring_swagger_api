package com.setec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.setec.models.Product;
import com.setec.services.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	@Autowired
	ProductService productService;
	@GetMapping("")
	public List<Product> getProductAll(){
		return productService.getProductAll();
	}
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable Integer id) {
		return productService.findProductById(id);
	}
	@GetMapping("/name/{name}")
	public List<Product> findProductByproductName(@PathVariable String name) {
		return productService.findProductByproductName(name);
	}
	@PostMapping("")
	public ResponseEntity<Object> save(@RequestBody Product product) {
		return productService.save(product);
	}
	
	
}
