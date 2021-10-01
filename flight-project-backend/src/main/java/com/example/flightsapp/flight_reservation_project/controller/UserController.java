package com.example.flightsapp.flight_reservation_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightsapp.flight_reservation_project.dto.UserDto;
import com.example.flightsapp.flight_reservation_project.entities.User;
import com.example.flightsapp.flight_reservation_project.exceptions.FlightNotFoundException;
import com.example.flightsapp.flight_reservation_project.exceptions.UserAlreadyExistException;
import com.example.flightsapp.flight_reservation_project.repositories.UserRepository;
//import com.example.flightsapp.flight_reservation_project.repositories.UserRepository;
import com.example.flightsapp.flight_reservation_project.service.UserService;
import org.modelmapper.ModelMapper;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")

public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private UserRepository userrepository;


	private ModelMapper modelMapper = new ModelMapper();


	
	@PostMapping("/user")
	public ResponseEntity<User> saveNewRegistration(@RequestBody UserDto userdto) throws UserAlreadyExistException {

		User userRequest = modelMapper.map(userdto, User.class);
		
		User saveUser=userservice.registration(userRequest); 

		
		
		return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/users")
    public ResponseEntity<?> getAllUsers() {
		
		
		
		return new ResponseEntity<List<User>>(userservice.getAllUsers(),HttpStatus.OK);
	}
	
	

	@PostMapping("/verifyLogin")
	public ResponseEntity<?> verifyLogin(@RequestBody UserDto userDto) {
		
		User us = userrepository.getByEmail(userDto.getEmail());
		//System.out.println(us.getEmail());
		
		if(us.getEmail().equals(userDto.getEmail()) && us.getPassword().equals(userDto.getPassword())) {
			
			return new ResponseEntity<>(us,HttpStatus.OK);
		} 
       else {
			
       	return new ResponseEntity<>("!!!! INVALID email/password !!!!",HttpStatus.NOT_ACCEPTABLE);
		
	}
		
	}
	
	
	@ExceptionHandler(value = UserAlreadyExistException.class)
    public ResponseEntity<String> UserAlreadyExistException(UserAlreadyExistException userAlreadyExistException) {
        return new ResponseEntity<String>("User already Exist", HttpStatus.CONFLICT);
    }
	
	


}
