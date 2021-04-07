package com.qa.day4;

public class Animal {
	// variables should be something all animals have
	private String hunger = "Hungry";
	private String rest = "Tired";
	private String status = "Stationary";
	private int speedMPH;
	private int numberOfLegs;

	// default constuctor for Animal class
	public Animal() {

	}

	// methods should be something that all animals do
	public void sleep() {
		System.out.println("Sleeping zzz");
		this.rest = "Well rested";
	}

	public void eat() {
		System.out.println("Eating nomnomnom");
		this.hunger = "full";
	}

	public void move() {
		System.out.println("I am moving at the speed " + speedMPH + " per hour!");
		this.status = "Moving";
	}

	public void stop() {
		System.out.println("I have stopped moving.");
		this.status = "Stationary";
	}
	

//	// constructor depending on the number of legs
//	public Animal(int number, int speed) {
//		this.numberOfLegs = number;
//		this.speedMPH = speed;
//
//	}

	// create getter and setter for number of legs and speed as this number can vary
	// depending
	// on the specific animal
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getStatus() {
		return status;
	}

//	public void setStatus(String status) {
//		this.status = status;
//	}

	public int getSpeedMPH() {
		return speedMPH;
	}

	public void setSpeedMPH(int speedMPH) {
		this.speedMPH = speedMPH;
	}

	public String getHunger() {
		return hunger;
	}

	public String getRest() {
		return rest;
	}

	// want to be able to only change the hunger via. the eat method
//	public void setHunger(String hunger) {
//		this.hunger = hunger;
//	}

	// want to only be able to change the rest variable via. the sleep method
//	public void setRest(String rest) {
//		this.rest = rest;
//	}

}
