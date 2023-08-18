package com.setec.models;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
	private String productName;
	@Column(name = "bacode",unique = true, nullable = true)
	private long bacode;
	@Column(name = "unitPrice", nullable = true)
	private double unitPrice;
	@Column(name = "qtyInstock", nullable = false)
	private long qtyInstock;
	@Column(name = "userId")
	private int userId;
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name = "CategoryId", nullable = true, referencedColumnName = "id")
	private Category category;
	@Column(name = "photo")
	private String photo;
	@CreationTimestamp
	@Column(name = "createAt", nullable = false)
	private Date createAt;
	@UpdateTimestamp
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + productName + ", bacode=" + bacode + ", unitPrice=" + unitPrice
				+ ", qtyInstock=" + qtyInstock + ", userId=" + userId + ", category=" + category + ", photo=" + photo
				+ ", createAt=" + createAt + ", updateAt=" + updateAt + ", getId()=" + getId() + ", getName()="
				+ getProductName() + ", getBacode()=" + getBacode() + ", getUnitPrice()=" + getUnitPrice()
				+ ", getQtyInstock()=" + getQtyInstock() + ", getCategory()=" + getCategory() + ", getUpdateAt()="
				+ getUpdateAt() + ", getUserId()=" + getUserId() + ", getPhoto()=" + getPhoto() + ", getCreateAt()="
				+ getCreateAt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
