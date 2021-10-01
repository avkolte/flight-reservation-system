package com.example.flightsapp.flight_reservation_project.service;

import java.util.List;

import com.example.flightsapp.flight_reservation_project.entities.Passenger;

public interface PassengerService {
	
	Passenger savePassengers(Passenger passenger);

	List<Passenger> getAllPassengers();
    
	Passenger getPassengerById(Long id);
}
