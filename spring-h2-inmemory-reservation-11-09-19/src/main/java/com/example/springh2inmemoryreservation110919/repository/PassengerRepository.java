package com.example.springh2inmemoryreservation110919.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2inmemoryreservation110919.model.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {

}
