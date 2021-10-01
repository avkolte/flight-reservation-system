package com.example.flightsapp.flight_reservation_project.service;

import java.time.LocalDate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightsapp.flight_reservation_project.entities.Flight;
import com.example.flightsapp.flight_reservation_project.exceptions.FlightNotFoundException;
import com.example.flightsapp.flight_reservation_project.repositories.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	private FlightRepository flightrepository;

	@Override
	public Flight saveFlights(Flight flight) {
		
		return flightrepository.save(flight);
	}

	@Override
	public List<Flight> getAllFlights() {
		
		return (List<Flight>) flightrepository.findAll();
	}

	@Override
	public Flight getFlightById(Long id){
		
		Optional<Flight> fid = flightrepository.findById(id);
		Flight result=fid.get();
		return result;
	}

	@Override
	public List<Flight> findFlights(String from, String to) throws FlightNotFoundException{
		
		List<Flight> results;

        if (flightrepository.findFlightsAll(from,to).isEmpty()) {
            throw new FlightNotFoundException();
        } else {
        	results=flightrepository.findFlightsAll(from,to);
        }
    
		
		 
		return results;
	}


}
