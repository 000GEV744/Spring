package com.example.demo.entity;

public class RequestPatient {

	 private String disease;

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public RequestPatient(String disease) {
		super();
		this.disease = disease;
	}

	public RequestPatient() {
		super();
	}
	 
	 
}
