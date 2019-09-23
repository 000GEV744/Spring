package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Patient;

import com.example.demo.repository.PatientRepository;

@Component
public class DevJpaBootsrap implements ApplicationListener<ContextRefreshedEvent> {

	private PatientRepository patRepo;

	public DevJpaBootsrap(PatientRepository patRepo) {
		super();
		this.patRepo = patRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	private void init() {
		Patient an = new Patient("Anuj Singh", "dehydration");
		Patient vik = new Patient("Vikram Singh", "dengue");
		Patient smi = new Patient("Smriti Chaurasia", "dengue");
		patRepo.save(an);
		patRepo.save(vik);
		patRepo.save(smi);
		
	}
}
