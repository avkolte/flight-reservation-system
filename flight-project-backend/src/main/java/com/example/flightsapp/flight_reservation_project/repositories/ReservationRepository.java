package com.example.flightsapp.flight_reservation_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightsapp.flight_reservation_project.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
