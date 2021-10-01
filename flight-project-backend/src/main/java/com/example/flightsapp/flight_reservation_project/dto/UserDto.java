package com.example.flightsapp.flight_reservation_project.dto;

public class UserDto {
	
	
	private String firstName; 
	private String lastName; 
	private String email; 
	private String password;
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + "]";
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public UserDto() {
		
	}
	public UserDto(String firstName, String lastName, String email, String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
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
