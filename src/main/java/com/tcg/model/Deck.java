package com.tcg.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Deck {

	@Id
	private String id;
	
	private List<Card> cardList;
	private String deckName;
	private int race;
	
	public List<Card> getCardList() {
		return cardList;
	}
	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}
	public String getDeckName() {
		return deckName;
	}
	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}
	public int getRace() {
		return race;
	}
	public void setRace(int race) {
		this.race = race;
	}
	
}
