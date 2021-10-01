package com.example.flightsapp.flight_reservation_project.entities;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="flight")
public class Flight extends EntitySuper {
	
	
	public Flight(String flightNumber, String operatingAirlines, String departureCity, String arrivalCity,
			String dateOfDeparture, Timestamp estimatedDepartureTime) {
		
		this.flightNumber = flightNumber;
		this.operatingAirlines = operatingAirlines;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	public Flight() {
		
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture
				+ ", estimatedDepartureTime=" + estimatedDepartureTime + "]";
	}
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	
	private String dateOfDeparture;
	private Timestamp estimatedDepartureTime;  
	
	
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
	

}
