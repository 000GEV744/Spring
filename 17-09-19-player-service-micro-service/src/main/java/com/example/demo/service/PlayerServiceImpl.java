package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepo;
	
	@Override
	public List<Player> getAllPlayers() {
		List<Player> list = playerRepo.findAll();
		return list;
	}

	@Override
	public void save(Player p) {
		playerRepo.save(p);
		System.out.println("saved!");
	}

	@Override
	public Player findById(int id) {
		Player player = playerRepo.findById(id).get();
		return player;
	}

	@Override
	public void deletById(int id) {
		playerRepo.deleteById(id);
	    System.out.println("deleted!");
	}

}
