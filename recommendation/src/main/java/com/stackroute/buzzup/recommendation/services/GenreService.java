package com.stackroute.buzzup.recommendation.services;

import com.stackroute.buzzup.recommendation.domain.Genre;

public interface GenreService {
	public Genre findByName(String genreName);

	
}
