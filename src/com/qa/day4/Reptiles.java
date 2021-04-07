package com.qa.day4;

public class Reptiles extends Animal{
	
	// all reptiles have these variables
	private boolean warmBlooded = false;
	private String skin = "Scales";
	private int reptileLegs = 4;
	
	//default constructor called - sets the animal legs to 4
	public Reptiles() {
		setNumberOfLegs(this.reptileLegs);
	}
	
	public void crawl() {
		System.out.println("Moving all 4 of my legs and crawling");
		move();
	}
	
	public void whipTongue() {
		System.out.println("whipwhipwhip - it's kind of creepy");
	}
	
	
	

}
