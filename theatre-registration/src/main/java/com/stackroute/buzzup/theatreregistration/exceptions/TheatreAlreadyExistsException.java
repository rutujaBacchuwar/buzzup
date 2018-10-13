package com.stackroute.buzzup.theatreregistration.exceptions;

public class TheatreAlreadyExistsException extends Exception {

	// throws TheatreAlreadyExists exception, if the theatre with same name is posted
	public TheatreAlreadyExistsException(String s) {
		super(s);
	}

}