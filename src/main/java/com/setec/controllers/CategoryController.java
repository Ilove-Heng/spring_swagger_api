package com.setec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.setec.models.Category;
import com.setec.models.Product;
import com.setec.services.CategoryService;
import com.setec.services.ProductService;

//import com.setec.services.CategoryService;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	@PostMapping("")
	public ResponseEntity<Object> save(@RequestBody Category category) {
		return categoryService.save(category);
	}
	@GetMapping("")
	public List<Category> getCategoryAll() {
		return categoryService.getCategoryAll();
	}
	@GetMapping("/{id}")
	public Category findCategoryById(@PathVariable Integer id) {
		return categoryService.findById(id);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteCategoryById(@PathVariable Integer id) {
		return categoryService.deleteCategoryById(id);
	}
	@PutMapping("/update")
	public ResponseEntity<Object> updateCategoryById(@RequestBody Category category) {
		return categoryService.updateCategoryById(category);
	}	
}






