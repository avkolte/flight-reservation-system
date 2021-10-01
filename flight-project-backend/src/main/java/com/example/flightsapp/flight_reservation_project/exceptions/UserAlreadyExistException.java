package com.example.flightsapp.flight_reservation_project.exceptions;

public class UserAlreadyExistException extends RuntimeException{
	
	 private String message;
	    public UserAlreadyExistException(String message) {
	        super(message);
	        this.setMessage(message);
	    }
	    public UserAlreadyExistException() {
	    }
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
}
