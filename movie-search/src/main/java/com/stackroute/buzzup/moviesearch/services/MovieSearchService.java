package com.stackroute.buzzup.moviesearch.services;

import java.util.List;

import com.stackroute.buzzup.kafka.domain.MovieSchedule;
import com.stackroute.buzzup.moviesearch.domain.City;
import com.stackroute.buzzup.moviesearch.domain.Movie;
import com.stackroute.buzzup.moviesearch.exceptions.MovieNotFoundException;

public interface MovieSearchService {
	public String saveCity(City city);

	public City getByCity(String city);

	public List<Movie> getByTitle(String movieName)  ;

	public void consumeKafka(MovieSchedule movieschedule);

	
}
