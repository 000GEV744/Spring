package com.example.demo.services;

import java.util.List;

import com.example.demo.modal.Patient;

public interface PatientServices {

	public List<Patient> getPatientByDisease(String disease);
}
