package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Doctor;

public interface DoctorService {

	public List<Doctor> getDoctors(String disease);
	
	
}
