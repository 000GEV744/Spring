package com.example.demo.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.modal.Doctor;

@FeignClient(name = "doctor-service", url = "http://localhost:8762/api/doctor/")
public interface DoctorClient {

	
	@GetMapping("/{speciality}")
	public List<Doctor> getDoctor(@PathVariable String speciality);
}
