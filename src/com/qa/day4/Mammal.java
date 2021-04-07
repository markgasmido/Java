package com.qa.day4;

public class Mammal extends Animal {

	// all mammals are warm blooded
	private boolean warmBlooded = true;
	private String furOrHair;

	// default constructor
	public Mammal() {

	}

	public void makeNoise() {
		System.out.println("Making noise");
	}
	
	public void temperatureCheck() {	
		System.out.println("I am warmblooded!!");
	}

	public boolean isWarmBlooded() {
		return warmBlooded;
	}

//	public void setWarmBlooded(boolean warmBlooded) {
//		this.warmBlooded = warmBlooded;
//	}

	public String getFurOrHair() {
		return furOrHair;
	}

	public void setFurOrHair(String furOrHair) {
		this.furOrHair = furOrHair;
	}

}
