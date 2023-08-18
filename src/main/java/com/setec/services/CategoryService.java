package com.setec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.setec.models.Category;
import com.setec.repositorys.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
	public ResponseEntity<Object> save(Category category) {
		categoryRepository.save(category);
		return new ResponseEntity<Object>("Category created", HttpStatus.CREATED);
	}
	public List<Category> getCategoryAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
	public Category findById(Integer id) {
		// TODO Auto-generated method stub
//		return categoryRepository.findById(id).get();
		
		Optional<Category> categoryOptional = categoryRepository.findById(id);
		if(categoryOptional.isPresent()) {
			return categoryOptional.get();
		}else {
			throw new RuntimeException("Category not found for id :" + id);
		}
	}
	public ResponseEntity<Object> deleteCategoryById(Integer id) {
		Category category = categoryRepository.findCategoryById(id);
		if(category	== null) {
			throw new RuntimeException("Category not found for id :" + id);
		}
		categoryRepository.delete(category);
		return new ResponseEntity<Object>("Category deleted" + id, HttpStatus.OK);
	}
	public ResponseEntity<Object> updateCategoryById(Category category) {
		Category categoryById = categoryRepository.findCategoryById(category.getId());
		if(categoryById == null) {
			throw new RuntimeException("No found id :" + category.getId());
		}
		categoryRepository.save(category);
		return new ResponseEntity<Object>("Category updated" ,HttpStatus.OK);
	}
}
