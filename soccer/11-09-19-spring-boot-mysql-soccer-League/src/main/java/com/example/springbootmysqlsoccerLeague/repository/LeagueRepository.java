package com.example.springbootmysqlsoccerLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootmysqlsoccerLeague.repository.model.League;

@Repository
public interface LeagueRepository extends JpaRepository<League, Integer> {

}
