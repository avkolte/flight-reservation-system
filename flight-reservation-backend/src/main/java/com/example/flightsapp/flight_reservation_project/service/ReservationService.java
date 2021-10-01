package com.example.flightsapp.flight_reservation_project.service;

import java.util.List;

import com.example.flightsapp.flight_reservation_project.dto.ReservationDto;
import com.example.flightsapp.flight_reservation_project.entities.Flight;
import com.example.flightsapp.flight_reservation_project.entities.Reservation;

public interface ReservationService {

	Flight getFlightById(Long id);

	Reservation bookFlight(ReservationDto dto);
	
	List<Reservation> getAllReservations();
	
}
