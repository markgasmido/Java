package com.qa.day4;

public class Motorbike extends Vehicle {
	private int wheels = 2;
	private int passengers = 2;
	private int max = 150;
	private int ID;
	private int stylePoints;
	
	public Motorbike(int i,int id) {
		this.stylePoints = i;
		setMaxSpeed(this.max);
		setNumberOfWheels(this.wheels);
		setMaxPassengers(this.passengers);
		this.ID = id;
		setID(this.ID);
	}
}
