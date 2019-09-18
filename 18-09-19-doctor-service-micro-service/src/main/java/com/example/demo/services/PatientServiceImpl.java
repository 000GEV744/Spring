package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.feignclients.PatientClient;
import com.example.demo.modal.Patient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PatientServiceImpl implements PatientServices {

	@Autowired
	private PatientClient patCln;
	
	
	@Override
	@HystrixCommand(fallbackMethod = "getPatientByFallBack")
	public List<Patient> getPatientByDisease(String disease) {
		List<Patient> patient=patCln.getPatient(disease);
		return patient;
	}
	
	
	public List<Patient> getPatientByFallBack(String disease){
		List<Patient> pat=new ArrayList<Patient>();
		Patient p = new Patient();
		p.setDisease(disease);
		p.setName("No Patient");
		p.setId(0);
		pat.add(p);
		return pat;
	}
}
