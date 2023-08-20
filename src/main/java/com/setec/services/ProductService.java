package com.setec.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

	public List<Product> getProductAll() {
		List<Product> productListALL = productRepository.findAll();
		List<Product> productList = new ArrayList<>();
		for(int i = 0; i < productListALL.size();i++) {
			Product product = new Product();
			product.setId(productListALL.get(i).getId());
			product.setProductName(productListALL.get(i).getProductName());
			product.setBacode(productListALL.get(i).getBacode());
			product.setUnitPrice(productListALL.get(i).getUnitPrice());
			product.setQtyInstock(productListALL.get(i).getQtyInstock());
			product.setUserId(productListALL.get(i).getUserId());
			productList.add(product);
		}
		return productListALL;
	}

	public Product findProductById(Integer id) {
		Product product = productRepository.findProductById(id);
		
		if(product == null) {
			throw new RuntimeException("Product not found for id :" + id);
		}	
		return product;
	}

	public List<Product> findProductByproductName(String name) {
		List<Product> productList=productRepository.findProductByproductName(name);
		return productList;
	}

	public ResponseEntity<Object> save(Product product) {
		Product product2 = new Product();
		product2.setProductName(product.getProductName());
		product2.setBacode(product.getBacode());
		product2.setUnitPrice(product.getUnitPrice());
		product2.setPhoto(product.getPhoto());
		product2.setUserId(product.getUserId());
		Date date = new Date();
		product2.setCreateAt(date);
		product2.setCategory(product.getCategory());
		productRepository.save(product);
		return new ResponseEntity<Object>("Product created", HttpStatus.CREATED);
	}

	public ResponseEntity<Object> deleteProductById(Integer id) {
		Product product = productRepository.findProductById(id);
		if(product == null) {
			throw new RuntimeException("Product not found for id :" + id);
		}
		productRepository.delete(product);
		return new ResponseEntity<Object>("Product deleted :" + id, HttpStatus.OK);
	}

	public ResponseEntity<Object> updateProductById(Product product) {
		Product productById = productRepository.findProductById(product.getId());
		if(productById == null) {
			throw new RuntimeException("No found id :" + product.getId());
		}
		productRepository.save(product);
		return new ResponseEntity<Object>("Product updated" ,HttpStatus.OK);
	}
	
}
