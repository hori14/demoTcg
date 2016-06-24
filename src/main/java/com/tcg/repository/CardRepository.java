package com.tcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.tcg.model.Card;

//public interface CardRepository extends MongoRepository<Card, String> {
public interface CardRepository extends JpaRepository<Card, String> {
	
	public Card findByName(String name);
	public List<Card> findByHealth(int health);
	public void deleteByName(String name);

}
