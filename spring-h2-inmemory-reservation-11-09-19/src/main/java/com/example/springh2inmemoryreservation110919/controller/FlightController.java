package com.example.springh2inmemoryreservation110919.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springh2inmemoryreservation110919.repository.FlightRepository;
import com.example.springh2inmemoryreservation110919.repository.PassengerRepository;

@Controller
@RequestMapping("/api")
public class FlightController {

	private FlightRepository flightRepository;
	private PassengerRepository passengerRepository;

	
	
	public FlightController(FlightRepository flightRepository, PassengerRepository passengerRepository) {
		super();
		this.flightRepository = flightRepository;
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("/flight")
	public String showFlights(Model m) {
		m.addAttribute("FLIGHTS", flightRepository.findAll());
		return "flight";
	}
	
	@GetMapping("/passenger")
	public String showPassengers(Model m) {
		m.addAttribute("Passenger", passengerRepository.findAll());
		return "passenger";
	}
}
