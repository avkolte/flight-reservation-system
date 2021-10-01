package com.example.flightsapp.flight_reservation_project.dto;

public class ReservationDto {
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	
	
	private String phone;
	private int numberOfBags;
	private long flightId;
	
	
	public ReservationDto(String firstName, String lastName, String middleName, String email, String phone,
			int numberOfBags, long flightId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.phone = phone;
		this.numberOfBags = numberOfBags;
		this.flightId = flightId;
	}
	public ReservationDto() {
		
	}
	@Override
	public String toString() {
		return "ReservationDto [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", email=" + email + ", phone=" + phone + ", numberOfBags=" + numberOfBags + ", flightId=" + flightId
				+ "]";
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
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
