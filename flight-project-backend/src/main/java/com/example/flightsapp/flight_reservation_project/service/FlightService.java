package com.example.flightsapp.flight_reservation_project.service;

import java.time.LocalDate;

import java.util.List;

import com.example.flightsapp.flight_reservation_project.entities.Flight;
import com.example.flightsapp.flight_reservation_project.exceptions.FlightNotFoundException;

public interface FlightService {
	
	Flight saveFlights(Flight flight);
	List<Flight> getAllFlights();
	Flight getFlightById(Long id);
	List<Flight> findFlights(String from,String to) throws FlightNotFoundException;
}
