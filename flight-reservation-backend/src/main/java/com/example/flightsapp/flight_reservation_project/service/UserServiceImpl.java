package com.example.flightsapp.flight_reservation_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightsapp.flight_reservation_project.dto.UserDto;
import com.example.flightsapp.flight_reservation_project.entities.User;
import com.example.flightsapp.flight_reservation_project.exceptions.UserAlreadyExistException;
import com.example.flightsapp.flight_reservation_project.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userrepository;

	@Override
	public User registration(User user) throws UserAlreadyExistException{
		
		
		
	       if (emailExist(user.getEmail())) {
	           throw new UserAlreadyExistException();
	        }

			else
			{
	      		
	        
	    User userData = userrepository.save(user);
		return userData;	
			}
		 
	}

	private boolean emailExist(String email) {
        return userrepository.searchByEmail(email) != null;
    }

	@Override
	public List<User> getAllUsers() {
		
		return (List<User>) userrepository.findAll();
	}

}
