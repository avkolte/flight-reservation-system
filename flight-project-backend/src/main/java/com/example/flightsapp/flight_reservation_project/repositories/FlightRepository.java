package com.example.flightsapp.flight_reservation_project.repositories;



import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.flightsapp.flight_reservation_project.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	
	
	@Query("from Flight where departureCity=:from and arrivalCity=:to")
	List<Flight> findFlightsAll(@Param("from") String from, @Param("to") String to);



	
}
