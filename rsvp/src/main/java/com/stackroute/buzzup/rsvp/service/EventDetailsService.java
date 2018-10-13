package com.stackroute.buzzup.rsvp.service;



import java.util.List;

import com.stackroute.buzzup.rsvp.domain.EventDetails;

public interface EventDetailsService {
	
	public EventDetails saveEvent(EventDetails eventDetails);
	
	public List<EventDetails> getEvent(String emailId);
	
	public EventDetails eventData(String eventName);
	
	public List<EventDetails> getDetails();

}
