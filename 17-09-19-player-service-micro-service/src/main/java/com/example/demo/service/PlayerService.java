package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Player;

public interface PlayerService {

	public List<Player> getAllPlayers();
	public void save(Player p) ;
	public Player findById(int id);
	public void deletById(int id);
}
