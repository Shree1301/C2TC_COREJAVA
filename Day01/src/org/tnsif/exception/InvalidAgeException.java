package org.tnsif.exception;

public class InvalidAgeException extends Exception { // you have to extend parent class exception
	
	public InvalidAgeException() {
		super("invalid Age");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}

}
