package com.example.springh2inmemoryreservation110919.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Passenger {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private String firstName;
	private String lastName;
	private String email;
	
	 @ManyToMany
	 @JoinTable(name = "Reservation", joinColumns = @JoinColumn(name = "passenger_id"),
	 inverseJoinColumns = @JoinColumn(name = "flight_id"))
	 private Set<Flight> flights = new HashSet<>();

	 
	 
	public Passenger() {
		super();
	}

	public Passenger(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Passenger(String firstName, String lastName, String email, Set<Flight> flights) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.flights = flights;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Flight> getFlights() {
		return flights;
	}

	public void setFlights(Set<Flight> flights) {
		this.flights = flights;
	}
	
	 
	 
}
