package com.setec.models;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "productName",unique = true, nullable = true)
	private String name;
	@Column(name = "bacode",unique = true, nullable = true)
	private long bacode;
	@Column(name = "unitPrice", nullable = true)
	private double unitPrice;
	@Column(name = "qtyInstock", nullable = false)
	private long qtyInstock;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CategoryId", nullable = true, referencedColumnName = "id")
	private Category category;
	@CreationTimestamp
	@Column(name = "UpdateAt", nullable = false)
	private Date updateAt;
	
	public Product() {
		// TODO Auto-generated constructor stub
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBacode() {
		return bacode;
	}
	public void setBacode(long bacode) {
		this.bacode = bacode;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public long getQtyInstock() {
		return qtyInstock;
	}
	public void setQtyInstock(long qtyInstock) {
		this.qtyInstock = qtyInstock;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
}
