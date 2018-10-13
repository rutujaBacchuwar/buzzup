package com.stackroute.buzzup.recommendation.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.buzzup.recommendation.domain.Theatre;

public interface TheatreRepository extends Neo4jRepository<Theatre, String>{

}
