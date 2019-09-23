package com.example.springh2inmemoryreservation110919.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2inmemoryreservation110919.model.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

}
