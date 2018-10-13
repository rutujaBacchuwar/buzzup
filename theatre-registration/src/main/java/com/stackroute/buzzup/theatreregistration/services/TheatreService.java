package com.stackroute.buzzup.theatreregistration.services;

import com.stackroute.buzzup.kafka.domain.Theatre;
import com.stackroute.buzzup.theatreregistration.exceptions.TheatreAlreadyExistsException;
import com.stackroute.buzzup.theatreregistration.exceptions.TheatreNotFoundException;

//interface to define methods that service should support 
public interface TheatreService {

	// To save the theatre details
	public Theatre saveTheatre(Theatre theatre) throws TheatreAlreadyExistsException;

	// To update the theatre details
	public Theatre updateTheatre(Theatre theatre) throws TheatreNotFoundException;

	// To get the theatre by using theatre-title from database
	public Theatre getTheatre(String theatreTitle) throws TheatreNotFoundException;
	
	public Theatre getEmailId(String email) throws TheatreNotFoundException;
	
	

}