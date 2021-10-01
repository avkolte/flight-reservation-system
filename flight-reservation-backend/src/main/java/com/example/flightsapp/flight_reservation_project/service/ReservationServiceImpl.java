package com.example.flightsapp.flight_reservation_project.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightsapp.flight_reservation_project.dto.ReservationDto;
import com.example.flightsapp.flight_reservation_project.entities.Flight;
import com.example.flightsapp.flight_reservation_project.entities.Passenger;
import com.example.flightsapp.flight_reservation_project.entities.Reservation;
import com.example.flightsapp.flight_reservation_project.repositories.FlightRepository;
import com.example.flightsapp.flight_reservation_project.repositories.PassengerRepository;
import com.example.flightsapp.flight_reservation_project.repositories.ReservationRepository;
@Service
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	private FlightRepository flightrepository;
	
	@Autowired
	private PassengerRepository passengerrepository;
	
	@Autowired
	private ReservationRepository reservationrepository;

	@Autowired
	private PassengerService passengerService;

	@Override
	public Flight getFlightById(Long id) {
		Optional<Flight> fid=flightrepository.findById(id);
		Flight result=fid.get();
		return result;
	}

	@Override
	public Reservation bookFlight(ReservationDto dto) {
		Optional<Flight> resFlightId=flightrepository.findById(dto.getFlightId());
		Flight resId=resFlightId.get();
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(dto.getFirstName());
		passenger.setLastName(dto.getLastName());
		passenger.setMiddleName(dto.getMiddleName());
		passenger.setEmail(dto.getEmail());
		passenger.setPhone(dto.getPhone());
		passenger.setNumberOfBags(dto.getNumberOfBags());
		
		passengerService.savePassengers(passenger);
		
		Reservation reservation=new Reservation();
		reservation.setNumberOfBags(dto.getNumberOfBags());
		reservation.setFlight(resId);
		reservation.setPassenger(passenger);
		
		reservationrepository.save(reservation);
		return reservation;
	}

	@Override
	public List<Reservation> getAllReservations() {
		
		return reservationrepository.findAll();
	}


	
	


	
	
	
}
