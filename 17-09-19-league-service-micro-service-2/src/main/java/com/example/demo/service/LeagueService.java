package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.League;

public interface LeagueService {

	public List<League> getAllLeague();
	public void save(League l);
	public League findById(int id);
	public void deleteById(int id);
	
}
