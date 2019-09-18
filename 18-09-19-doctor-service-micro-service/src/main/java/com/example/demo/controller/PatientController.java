package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feignclients.PatientClient;
import com.example.demo.modal.Patient;
import com.example.demo.services.PatientServices;


@RestController
public class PatientController {

	@Autowired
	private PatientServices patServ;

	@GetMapping("/fetchpatients/{disease}")
	public List<Patient> getPatientsByDisease(@PathVariable String disease){
		return patServ.getPatientByDisease(disease);
	}
	
	
	
}
