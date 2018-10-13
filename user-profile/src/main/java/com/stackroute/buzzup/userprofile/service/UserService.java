package com.stackroute.buzzup.userprofile.service;

import com.stackroute.buzzup.kafka.domain.InputUser;
import com.stackroute.buzzup.kafka.domain.Movie;
import com.stackroute.buzzup.kafka.domain.UserProfile;
import com.stackroute.buzzup.userprofile.exceptions.ProfileAlreadyExitsException;
import com.stackroute.buzzup.userprofile.exceptions.UpdateFailedException;
import com.stackroute.buzzup.userprofile.exceptions.UserDoesNotExistsException;


//user service class should implement these methods for sure
public interface UserService {
	
	//Saves the user
	public InputUser saveUser(InputUser inputUser) throws ProfileAlreadyExitsException ;
	//Views the user
	public InputUser viewUser(String userId) throws UserDoesNotExistsException;
	//Updates the user
	public InputUser updateUser(String userId, UserProfile user) throws UpdateFailedException,UserDoesNotExistsException;
	
	
}
