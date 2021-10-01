package com.example.flightsapp.flight_reservation_project.exceptions;

public class FlightNotFoundException extends RuntimeException{
	
	private String message;
    public FlightNotFoundException(String message) {
        super(message);
        this.setMessage(message);
    }
    public FlightNotFoundException() {
    }
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
