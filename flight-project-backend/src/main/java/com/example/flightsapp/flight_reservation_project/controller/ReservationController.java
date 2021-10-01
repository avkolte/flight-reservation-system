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

import com.example.flightsapp.flight_reservation_project.dto.ReservationDto;
import com.example.flightsapp.flight_reservation_project.entities.Flight;

import com.example.flightsapp.flight_reservation_project.entities.Reservation;

import com.example.flightsapp.flight_reservation_project.service.ReservationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")

public class ReservationController {
	
	@Autowired
	private ReservationService reservationservice;
	
	
	@GetMapping("/flightDetail/{id}")
	public ResponseEntity<Flight> getFlightById(@PathVariable("id") Long id) {
	      
        Flight flight=reservationservice.getFlightById(id);
        
        return ResponseEntity.ok().body(flight);

}
	
	@PostMapping("/passengerDetails")
	public ResponseEntity<Reservation> confirmRegistration(@RequestBody ReservationDto dto)
	{
		Reservation details=reservationservice.bookFlight(dto);
		return ResponseEntity.ok().body(details);
	}
	
	@GetMapping("/reservations")
	public ResponseEntity<?> getAllReservations()
	{
		return new ResponseEntity<List<Reservation>>(reservationservice.getAllReservations(),HttpStatus.OK);
	}

}
