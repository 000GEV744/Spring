package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserEntityRepository;

@Component
public class DevJpaBootsrap implements ApplicationListener<ContextRefreshedEvent> {

	private UserEntityRepository userEntityRepo;
	
	
	public DevJpaBootsrap(UserEntityRepository userEntityRepo) {
		super();
		this.userEntityRepo = userEntityRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	private void init() {
		UserEntity user = new UserEntity("Anuj", "Singh", "anuj@hdd.com", "qwye15", "wqt1245");
		userEntityRepo.save(user);
		
		
	}
}
