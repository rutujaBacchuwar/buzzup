package com.stackroute.buzzup.moviesearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.buzzup.moviesearch.domain.City;
import com.stackroute.buzzup.moviesearch.domain.Movie;
import com.stackroute.buzzup.moviesearch.services.MovieSearchServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1")
public class MovieSearchController {
MovieSearchServiceImpl searchService;
	
	@Autowired
	public MovieSearchController(MovieSearchServiceImpl searchService) {
	this.searchService=searchService;
	}
	@RequestMapping(value = "/movie/{movieName}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<?> getMovieByName(@PathVariable String movieName) {
		List<Movie> movie=searchService.getByTitle(movieName);
		return new ResponseEntity<List<Movie>>(movie,HttpStatus.OK);

	}
	@RequestMapping(value = "/city/{cityName}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<?> getCityByName(@PathVariable 
			String cityName) {
		City city=searchService.getByCity(cityName);
		return new ResponseEntity<City>(city,HttpStatus.OK);

	}
	@RequestMapping(value = "/city", method = RequestMethod.POST, produces = { "application/json" })
	public ResponseEntity<?> saveCity(@RequestBody City city) {
		
		String response =searchService.saveCity(city);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
