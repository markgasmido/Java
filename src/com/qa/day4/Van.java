package com.qa.day4;

public class Van extends Vehicle{
	private int wheels = 4;
	private int passengers = 10;
	private int max = 70;
	private int ID;
	private int maxStorage;
	
	public Van(int max,int id) {
		this.maxStorage = max;
		setMaxSpeed(this.max);
		setNumberOfWheels(this.wheels);
		setMaxPassengers(this.passengers);
		this.ID = id;
		setID(this.ID);
	}
}
