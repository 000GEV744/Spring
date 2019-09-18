package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository docRepo;

	@Override
	public List<Doctor> getDoctors(String speciality) {
		List<Doctor> doc= docRepo.getDocBySpeciality(speciality);
		return doc;
	}

}
