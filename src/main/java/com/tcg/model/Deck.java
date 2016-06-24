package com.tcg.model;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Deck {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	//private List<Card> cardList;
	private String deckName;
	private int race;
	
}
