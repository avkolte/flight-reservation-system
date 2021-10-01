package com.example.flightsapp.flight_reservation_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.flightsapp.flight_reservation_project.entities.Passenger;
import com.example.flightsapp.flight_reservation_project.service.PassengerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")

public class PassengerController {
	
	
	@Autowired
	private PassengerService passengerservice;
	
	@PostMapping("/passenger")
	public ResponseEntity<Passenger> savePassengers(@RequestBody Passenger passenger) {
		
		Passenger savePassenger=passengerservice.savePassengers(passenger); 
		
		return new ResponseEntity<>(savePassenger, HttpStatus.CREATED);
	}
	
	@GetMapping("/passengers")
    public ResponseEntity<?> getAllPassengers() {
		
		return new ResponseEntity<List<Passenger>>(passengerservice.getAllPassengers(),HttpStatus.OK);
	}
	
	@GetMapping("/passenger/{id}")
	public ResponseEntity<Passenger> getPassengerById(@PathVariable("id") Long id) {
      
		Passenger passengerid=passengerservice.getPassengerById(id);
        
        return ResponseEntity.ok().body(passengerid);
	}
	

}
