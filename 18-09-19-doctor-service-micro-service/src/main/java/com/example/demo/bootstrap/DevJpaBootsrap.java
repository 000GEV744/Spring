package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Doctor;

import com.example.demo.repository.DoctorRepository;


@Component
public class DevJpaBootsrap implements ApplicationListener<ContextRefreshedEvent> {

	private DoctorRepository docRepo;

	

	public DevJpaBootsrap(DoctorRepository docRepo) {
		super();
		this.docRepo = docRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	private void init() {
		Doctor an = new Doctor("Vikas Malhotra" ,"dehydration");
		
		docRepo.save(an);
	
		
	}
}
