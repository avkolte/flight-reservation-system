package com.example.flightsapp.flight_reservation_project.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity

public class Reservation extends EntitySuper {

	
	
	@OneToOne
	private Flight flight;
	
	public Reservation() {
		
	}

	public Reservation(Flight flight, Passenger passenger, int numberOfBags) {
		
		this.flight = flight;
		this.passenger = passenger;
		this.numberOfBags = numberOfBags;
	}

	@Override
	public String toString() {
		return "Reservation [flight=" + flight + ", passenger=" + passenger + ", numberOfBags=" + numberOfBags + "]";
	}

	@OneToOne
	private Passenger passenger;
	
	private int numberOfBags;

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	
	
	
	
	
}

