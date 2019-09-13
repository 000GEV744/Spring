package com.example.springbootmysqlsoccerLeague.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springbootmysqlsoccerLeague.repository.LeagueRepository;
import com.example.springbootmysqlsoccerLeague.repository.model.League;

@Service
public class LeagueServiceImpl  implements LeagueService{

	private LeagueRepository leagueRepository;
	
	
	public LeagueServiceImpl(LeagueRepository leagueRepository) {
		super();
		this.leagueRepository = leagueRepository;
	}

	@Override
	public List<League> getAllLeague() {
		List<League> league=leagueRepository.findAll();
		return league;
	}

	@Override
	public void save(League l) {
		leagueRepository.save(l);
		
	}

	@Override
	public League findById(int id) {
		Optional<League> result =leagueRepository.findById(id);
        League l = null ;
        if(result.isPresent()) {
        	l=result.get();
        }
        return l;
        
	}

	@Override
	public void deleteById(int id) {
		leagueRepository.deleteById(id);
		
	}

}
