package com.example.springbootmysqlsoccerLeague.services;

import java.util.List;

import com.example.springbootmysqlsoccerLeague.repository.model.League;

public interface LeagueService {

	public List<League> getAllLeague();
	public void save(League l);
	public League findById(int id);
	public void deleteById(int id);
	
}
