package com.setec.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;


@Entity
@Table(name="SaleDetail")
public class SaleDetail {
	public SaleDetail() {
		// TODO Auto-generated constructor stub
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne()
	@JoinColumn(name = "productId",nullable = true,referencedColumnName = "id")
	private Product product;
	@ManyToOne()
	@JoinColumn(name = "saleId",nullable = true,referencedColumnName = "id")
	private Sale sale;
	@Column(name = "qty")
	private int qty;
	@Column(name = "price")
	private double price;
	@Column(name = "amount", nullable = true)
	private double amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "SaleDetail [id=" + id + ", product=" + product + ", sale=" + sale + ", qty=" + qty + ", price=" + price
				+ ", amount=" + amount + ", getId()=" + getId() + ", getProduct()=" + getProduct() + ", getSale()="
				+ getSale() + ", getQty()=" + getQty() + ", getPrice()=" + getPrice() + ", getAmount()=" + getAmount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
