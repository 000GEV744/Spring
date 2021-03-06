package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feignClients.PlayerServiceClient;
import com.example.demo.response.Player;

@Controller
public class PlayerController {
	

	@Autowired
	private PlayerServiceClient playerServiceClient;

	@GetMapping("/fetchplayers")
	public String getAllplayers(Model m){
		
		List<Player> playerList=playerServiceClient.getAllProducts();
		m.addAttribute("Players", playerList);
		return "player/view-player";
	
	}
	
	@GetMapping("/fetchplayers/{id}")
	public String getAllplayers(@PathVariable int id, Model m){
		Player player=playerServiceClient.getPlayersById(id);
		List<Player> playerList=new ArrayList<Player>();
		playerList.add(player);
		m.addAttribute("Players", playerList);
		return "player/view-player";
	}
	
	
	@GetMapping("/addpLayer")
	public String addPlayer(Model m) {
		Player p=new Player();
		m.addAttribute("Player", p);
		return "player/player-form";
	}
	
	
	@GetMapping("/deleteplayer/{id}")
	public String deleteplayers(@PathVariable int id, Model m){
		playerServiceClient.deletePlayersById(id);
		return "redirect:/fetchplayers";
	}
	
	@GetMapping("/updateplayer/{id}")
	public String updatePlayer(@PathVariable int id, Model m) {
		Player player=playerServiceClient.getPlayersById(id);
		m.addAttribute("Player", player);
		return "player/player-form";
	}
	
	@PostMapping("/save")
	public String savePlayer(@ModelAttribute Player player) {
		System.out.println(player.getEmail());
		playerServiceClient.savePlayer(player);
		return "redirect:/fetchplayers";
		
	}
	
	
	
}
