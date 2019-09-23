package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patRepo;

	@Override
	public List<Patient> findPatient(String disease) {
		List<Patient> patient = patRepo.findByDisease(disease);
		return patient;
	}
}
