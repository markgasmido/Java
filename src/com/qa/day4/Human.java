package com.qa.day4;

public class Human extends Mammal {
	
	private int speedspeed = 4;
	private String name;
	private int age;

	//Default constructor sets variables in mammal and animal
	public Human() {
		setFurOrHair("Hair");
		setNumberOfLegs(2);
		setSpeedMPH(this.speedspeed);
	}
	
	// Constructor sets variable in mammal and animal and parses in variables to change variables in human
	public Human(String s, int a) {
		this.name = s;
		this.age = a;
		setFurOrHair("Hair");
		setNumberOfLegs(2);
		setSpeedMPH(this.speedspeed);
	}
	
	public void goPark() {
		move();
		stop();
		System.out.println("I am now at the park!! Hope it doesn't rain...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSpeedspeed() {
		return speedspeed;
	}

//	public void setSpeedspeed(int speedspeed) {
//		this.speedspeed = speedspeed;
//	}
	
	
}
