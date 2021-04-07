package com.qa.day4;

public class Car extends Vehicle{
	private int wheels = 4;
	private int passengers = 5;
	private int max = 100;
	private int ID;
	private String automaticOrManual;
	
	public Car(String s,int id) {
		this.automaticOrManual = s;
		setMaxSpeed(this.max);
		setNumberOfWheels(this.wheels);
		setMaxPassengers(this.passengers);
		this.ID = id;
		setID(this.ID);
	}
}
