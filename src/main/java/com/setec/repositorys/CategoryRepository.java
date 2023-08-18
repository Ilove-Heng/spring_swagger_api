package com.setec.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setec.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	Category findCategoryById(Integer id);

	Category deleteCategoryById(Integer id);
	
}
