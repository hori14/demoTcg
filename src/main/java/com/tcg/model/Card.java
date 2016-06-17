package com.tcg.model;

import org.springframework.data.annotation.Id;

public class Card {

	@Id
	private String Id;
	
	
	private String name;
	private int power;
	private int health;
	private int cost;
	private int grade;
	private int race;
	private int version;
	
	public Card(){}
	
	public Card(String name, int power, int health){
		this.name = name;
		this.power = power;
		this.health = health;
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {

		return String.format("Card[name=%s,%d/%d]", name, power, health);
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getRace() {
		return race;
	}

	public void setRace(int race) {
		this.race = race;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
}
