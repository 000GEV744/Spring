package com.example.demo.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.response.Player;


@FeignClient(name = "player-service",url = "http://localhost:8762/api/player")
public interface PlayerServiceClient {

	
	@GetMapping("/list")
	 public List < Player > getAllProducts();

	@GetMapping("/find/{id}")
	 public Player getPlayersById(@PathVariable("id") int playerId);
	
	@GetMapping("/delete/{id}")
	public void deletePlayersById(@PathVariable("id") int playerId);
	
	@PostMapping("/save")
	public void savePlayer(@ModelAttribute Player p);
}