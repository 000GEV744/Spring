package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feignclient.DoctorClient;
import com.example.demo.modal.Doctor;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DoctorController {

	@Autowired
	private DoctorClient docCL;
	
	@GetMapping("/fetchdoctors/{speciality}")
	@HystrixCommand(fallbackMethod = "getDoctorFallBack")
	public List<Doctor> getDoctor(@PathVariable String speciality){
		 List<Doctor> dc=docCL.getDoctor(speciality);
		 return dc;
	}
	
	public List<Doctor>  getDoctorFallBack (@PathVariable String speciality){
		List<Doctor> pat=new ArrayList<Doctor>();
		Doctor d = new Doctor();
		d.setSpeciality(speciality);
		d.setName("No doctor");
		d.setId(0);
		pat.add(d);
		return pat;
	}
	
}
