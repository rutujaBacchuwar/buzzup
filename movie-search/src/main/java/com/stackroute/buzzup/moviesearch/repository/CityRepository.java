package com.stackroute.buzzup.moviesearch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.buzzup.moviesearch.domain.City;

//declaring it as repository
@Repository   
	public interface CityRepository extends CrudRepository<City,String> {
	
	public City getBycityName(String city);
			public City findBycityName(String cityName);
		
	}