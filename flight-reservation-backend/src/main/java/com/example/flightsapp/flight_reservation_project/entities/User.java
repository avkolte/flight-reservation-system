package com.example.flightsapp.flight_reservation_project.entities;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User extends EntitySuper {
	
	
	private String firstName; 
	private String lastName; 
	public User(String firstName, String lastName, String email, String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ "]";
	}
	private String email; 
	private String password; 
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
