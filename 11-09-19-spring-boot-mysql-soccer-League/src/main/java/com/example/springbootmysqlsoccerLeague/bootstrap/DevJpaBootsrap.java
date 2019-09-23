package com.example.springbootmysqlsoccerLeague.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springbootmysqlsoccerLeague.services.LeagueServiceImpl;

@Component
public class DevJpaBootsrap implements ApplicationListener<ContextRefreshedEvent> {

	private LeagueServiceImpl service;
	
	public DevJpaBootsrap(LeagueServiceImpl service) {
		super();
		this.service = service;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	private void init() {
		
	}
}
