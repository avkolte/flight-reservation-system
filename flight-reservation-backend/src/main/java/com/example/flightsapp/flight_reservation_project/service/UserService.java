package com.example.flightsapp.flight_reservation_project.service;

import java.util.List;

import com.example.flightsapp.flight_reservation_project.dto.UserDto;
import com.example.flightsapp.flight_reservation_project.entities.User;
import com.example.flightsapp.flight_reservation_project.exceptions.UserAlreadyExistException;

public interface UserService {
	
	User registration(User user) throws UserAlreadyExistException;
	List<User> getAllUsers();

}
