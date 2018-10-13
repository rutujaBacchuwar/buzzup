package com.stackroute.buzzup.recommendation.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.buzzup.recommendation.domain.Genre;

@Repository
public interface GenreRepository extends Neo4jRepository<Genre, Long> {

	public Genre findByName(String name);

}
