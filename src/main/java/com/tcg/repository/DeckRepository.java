package com.tcg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tcg.model.Deck;

public interface DeckRepository extends MongoRepository<Deck, String> {

}
