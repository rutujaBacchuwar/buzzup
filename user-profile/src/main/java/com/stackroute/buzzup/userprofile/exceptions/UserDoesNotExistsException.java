package com.stackroute.buzzup.userprofile.exceptions;

//This exception is thrown when the InputUser want to view the profile
//which does not exits in the database
public class UserDoesNotExistsException extends Exception {
	
	public UserDoesNotExistsException(String s)
	{
		super(s);
	}

}
