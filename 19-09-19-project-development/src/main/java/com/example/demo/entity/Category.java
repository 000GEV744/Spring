package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CId;
	@Column( unique = true, nullable = false)
	private String categoryName;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private Set<Product> products;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Category() {
		super();
	}

	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}

	

	
	
}
