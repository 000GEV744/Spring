package com.example.springh2inmemoryreservation110919.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springh2inmemoryreservation110919.model.Flight;
import com.example.springh2inmemoryreservation110919.model.Passenger;
import com.example.springh2inmemoryreservation110919.repository.FlightRepository;
import com.example.springh2inmemoryreservation110919.repository.PassengerRepository;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent>{

	private FlightRepository flightRepository;
	private PassengerRepository passengerRepository;


	public DevJpaBootStrap(FlightRepository flightRepository, PassengerRepository passengerRepository) {
		super();
		this.flightRepository = flightRepository;
		this.passengerRepository = passengerRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		init();
	}
	
	private void init() {
		
				//crating passengers
		
		        Passenger brett = new Passenger("Brett", "Lee","brett23@gg.com");
		        Passenger hyd = new Passenger("Mathew", "Hyden","mhyd23@gg.com");
				
			
				//creating flights
				Flight indigo = new Flight("AUS723IN","Indigo","Canberra","Delhi");
				Flight turkish = new Flight("IN723GER","Turkish","Mumbai","Paris");
				Flight luf= new Flight("IN314US","Lufthansa","Kolkata","New York");
				Flight flyAsia = new Flight("MB713GA","Air Asia","Mumbai","Goa");
				
				
				
				//allocating all the flights and passengers to each other
				brett.getFlights().add(indigo);
				hyd.getFlights().add(indigo);
				brett.getFlights().add(luf);
				hyd.getFlights().add(flyAsia);
				
				flightRepository.save(indigo);
				flightRepository.save(turkish);
				flightRepository.save(luf);
				flightRepository.save(flyAsia);
				passengerRepository.save(brett);
				passengerRepository.save(hyd);
				
				
				
				
				
				
	}
}
