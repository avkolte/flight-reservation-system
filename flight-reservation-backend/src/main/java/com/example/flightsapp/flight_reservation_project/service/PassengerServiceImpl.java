package com.example.flightsapp.flight_reservation_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightsapp.flight_reservation_project.entities.Passenger;
import com.example.flightsapp.flight_reservation_project.repositories.PassengerRepository;
@Service
public class PassengerServiceImpl implements PassengerService{

	@Autowired
	private PassengerRepository passengerrepository;
	
	@Override
	public Passenger savePassengers(Passenger passenger) {
		
		return passengerrepository.save(passenger);
	}

	@Override
	public List<Passenger> getAllPassengers() {
		
		return (List<Passenger>) passengerrepository.findAll();
	}

	@Override
	public Passenger getPassengerById(Long id) {
		Optional<Passenger> pid=passengerrepository.findById(id);
		Passenger result = pid.get();
		return result;
	}

}
