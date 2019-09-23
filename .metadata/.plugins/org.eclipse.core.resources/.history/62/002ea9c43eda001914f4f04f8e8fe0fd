package com.example.demo.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.modal.Patient;



@FeignClient(name = "patient-service", url = "http://localhost:8762/api/patient")
public interface PatientClient {
	
	@GetMapping("/disease/{disease}")
	public List<Patient> getPatient(@PathVariable String disease);

}
