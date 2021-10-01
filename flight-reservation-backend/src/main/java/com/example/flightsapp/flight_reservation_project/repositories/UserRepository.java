package com.example.flightsapp.flight_reservation_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.flightsapp.flight_reservation_project.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	@Query("select email from User where email=:email")
	String searchByEmail(@Param("email") String email);

	@Query("from User where email=:email")
	User getByEmail(@Param("email") String email);

	
	

}
