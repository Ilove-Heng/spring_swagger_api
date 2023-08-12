package com.setec.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setec.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
