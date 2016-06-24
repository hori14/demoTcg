package com.tcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcg.model.Deck;

public interface DeckRepository extends JpaRepository<Deck, String> {

}
