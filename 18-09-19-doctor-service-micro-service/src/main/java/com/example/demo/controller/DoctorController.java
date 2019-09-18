package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService docServ;
	
	@GetMapping("/{speciality}")
	public List<Doctor> getDoctor(@PathVariable String speciality){
		List<Doctor> doc=docServ.getDoctors(speciality);
		return doc;
	}
}
