package com.example.springh2inmemoryreservation110919.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
public class Flight {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private String flightId;
	private String flightName;
	private String fromCity;
	private String toCity;
	
	@ManyToMany(mappedBy = "flights")
    private Set<Passenger> passengers  = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Flight(String flightId, String flightName, String fromCity, String toCity) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.fromCity = fromCity;
		this.toCity = toCity;
	}

	public Flight() {
		super();
	}

	public Flight(String flightId, String flightName, String fromCity, String toCity, Set<Passenger> passengers) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.passengers = passengers;
	}

	
	
	
	
}
