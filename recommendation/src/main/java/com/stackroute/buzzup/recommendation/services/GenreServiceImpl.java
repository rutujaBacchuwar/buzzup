package com.stackroute.buzzup.recommendation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.buzzup.recommendation.domain.Genre;
import com.stackroute.buzzup.recommendation.repositories.GenreRepository;

@Service
public class GenreServiceImpl implements GenreService {

	private GenreRepository genreRepository;

	@Autowired
	public GenreServiceImpl(GenreRepository genreRepository) {
		super();
		this.genreRepository = genreRepository;
	}

	@Override
	public Genre findByName(String name) {
		return genreRepository.findByName(name);
	}

}
