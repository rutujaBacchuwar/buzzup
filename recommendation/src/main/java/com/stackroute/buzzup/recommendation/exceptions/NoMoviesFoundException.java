package com.stackroute.buzzup.recommendation.exceptions;

public class NoMoviesFoundException extends Exception{
	private static final long serialVersionUID = 1L;    
	public NoMoviesFoundException(String message) {
        super(message);
    }
}
