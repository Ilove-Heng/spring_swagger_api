package com.setec.models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Sale")
public class Sale {
	public Sale() {
		// TODO Auto-generated constructor stub
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@CreationTimestamp
	@Column(name = "saleDate", nullable = true)
	private Date saleDate;
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name = "userId", nullable = true, referencedColumnName = "id")
	private User user;
	@Column(name = "totalAmount", nullable = true)
	private double totalAmount;
	@OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
	private List<SaleDetail> saleDetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public List<SaleDetail> getSaleDetails() {
		return saleDetails;
	}
	public void setSaleDetails(List<SaleDetail> saleDetails) {
		this.saleDetails = saleDetails;
	}
	@Override
	public String toString() {
		return "Sale [id=" + id + ", saleDate=" + saleDate + ", user=" + user + ", totalAmount=" + totalAmount
				+ ", saleDetails=" + saleDetails + ", getId()=" + getId() + ", getSaleDate()=" + getSaleDate()
				+ ", getUser()=" + getUser() + ", getTotalAmount()=" + getTotalAmount() + ", getSaleDetails()="
				+ getSaleDetails() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
