package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;
    private String speciality;
    
    
	public Doctor() {
		super();
	}
	
	public Doctor(String name, String speciality) {
		super();
		this.name = name;
		this.speciality = speciality;
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
	
	public String getSpeciality() {
		return speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
    
} 