package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Product{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private long id;
	@Column( unique = true, nullable = false)
	private String itemName;
	@Column( unique = true, nullable = false)
	private String itemDescription;
	@Column( unique = true, nullable = false)
	private double rentPerMonth;
	@Column( nullable = false)
	private double refundableDeposit;
	@Column( unique = true, nullable = false)
	private double offer;
	private String type;
	private int size;
	@Column( unique = true, nullable = false)
	private int availabForMonths;
	@Column( unique = true, nullable = false)
	private String imageLink;
	
	
	
	@ManyToOne
	@JoinColumn(name = "category_Id")
	private Category category;



	



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public String getItemDescription() {
		return itemDescription;
	}



	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}



	public double getRentPerMonth() {
		return rentPerMonth;
	}



	public void setRentPerMonth(double rentPerMonth) {
		this.rentPerMonth = rentPerMonth;
	}



	public double getRefundableDeposit() {
		return refundableDeposit;
	}



	public void setRefundableDeposit(double refundableDeposit) {
		this.refundableDeposit = refundableDeposit;
	}



	public double getOffer() {
		return offer;
	}



	public void setOffer(double offer) {
		this.offer = offer;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getAvailabForMonths() {
		return availabForMonths;
	}



	public void setAvailabForMonths(int availabForMonths) {
		this.availabForMonths = availabForMonths;
	}



	public String getImageLink() {
		return imageLink;
	}



	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public Product() {
		super();
	}



	public Product(String itemName, String itemDescription, double rentPerMonth, double refundableDeposit, double offer,
			String type, int size, int availabForMonths, String imageLink) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.rentPerMonth = rentPerMonth;
		this.refundableDeposit = refundableDeposit;
		this.offer = offer;
		this.type = type;
		this.size = size;
		this.availabForMonths = availabForMonths;
		this.imageLink = imageLink;
	}
	
	
	
	
	
}
