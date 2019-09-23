package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;


@Component
public class DevJpaBootsrap implements ApplicationListener<ContextRefreshedEvent> {

	private PlayerRepository playerRepo;

	public DevJpaBootsrap(PlayerRepository playerRepo) {
		super();
		this.playerRepo = playerRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	private void init() {
		Player an = new Player("Anuj", "Singh", "anuj@hdd.com","anuj354@");
		Player vik = new Player("Vikram", "Singh", "viksin@h.com","viksin84@");
		Player smi = new Player("Smriti", "Chaurasia", "smriti@dd.com","smriti34@");
		playerRepo.save(an);
		playerRepo.save(vik);
		playerRepo.save(smi);
		
	}
}
