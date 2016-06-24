package com.tcg.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Card {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	private String name;
	private int power;
	private int health;
	private int cost;
	private int grade;
	private int race;
	private int version;
	
}