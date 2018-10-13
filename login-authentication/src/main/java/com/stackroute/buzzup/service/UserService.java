package com.stackroute.buzzup.service;

import com.stackroute.buzzup.kafka.domain.InputUser;
import com.stackroute.buzzup.kafka.domain.User;

public interface UserService {
	// save the user
	User save(User user);

	// find user my email
	User findByEmail(String email);

	// consume message from kafka
	public void consumeKafka(InputUser User);

}
