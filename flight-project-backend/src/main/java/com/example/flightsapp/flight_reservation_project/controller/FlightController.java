package com.example.flightsapp.flight_reservation_project.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightsapp.flight_reservation_project.entities.DateConverter;
import com.example.flightsapp.flight_reservation_project.entities.Flight;
import com.example.flightsapp.flight_reservation_project.exceptions.FlightNotFoundException;
import com.example.flightsapp.flight_reservation_project.service.FlightService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")

public class FlightController {
	
	@Autowired
	private FlightService flightservice;
	
	@PostMapping("/flight")
	public ResponseEntity<Flight> saveFlights(@RequestBody Flight flight) {
		
		Flight saveFlight=flightservice.saveFlights(flight); 
		
		return new ResponseEntity<>(saveFlight, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/flights")
    public ResponseEntity<?> getAllFlights() {
		
		return new ResponseEntity<List<Flight>>(flightservice.getAllFlights(),HttpStatus.OK);
	}
	
	@GetMapping("/flight/{id}")
	public ResponseEntity<Flight> getFlightById(@PathVariable("id") Long id) {
      
        Flight flightid=flightservice.getFlightById(id);
        
        return ResponseEntity.ok().body(flightid);
    }
	
	@GetMapping("/findFlights")
	public ResponseEntity<List<Flight>> findFlights(@RequestParam("from") String from, @RequestParam("to") String to) throws FlightNotFoundException {
		
		
		
	
		
		List<Flight> resultsOfFlights = flightservice.findFlights(from, to);
		
		
		return ResponseEntity.ok().body(resultsOfFlights);
	}
	
	@ExceptionHandler(value = FlightNotFoundException.class)
    public ResponseEntity<String> FlightNotFoundException(FlightNotFoundException flightNotFoundException) {
        return new ResponseEntity<String>("Flight Not found", HttpStatus.NOT_FOUND);
    }
}
