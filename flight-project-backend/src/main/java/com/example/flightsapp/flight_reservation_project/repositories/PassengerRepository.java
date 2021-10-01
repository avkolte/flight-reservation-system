package com.example.flightsapp.flight_reservation_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightsapp.flight_reservation_project.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
