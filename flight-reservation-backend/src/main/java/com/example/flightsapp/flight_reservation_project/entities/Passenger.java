package com.example.flightsapp.flight_reservation_project.entities;

import javax.persistence.Entity;

@Entity
public class Passenger extends EntitySuper {

	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	public Passenger(String firstName, String lastName, String middleName, String email, String phone,
			int numberOfBags) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.phone = phone;
		this.numberOfBags = numberOfBags;
	}
	public Passenger() {
		
	}
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", email=" + email + ", phone=" + phone + ", numberOfBags=" + numberOfBags + "]";
	}
	private String phone;
	private int numberOfBags;
	
	
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
