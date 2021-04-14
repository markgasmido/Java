package com.qa.day8try2;

public class Manchester {
	//example of only being able to create one instance of an object using static members and private constructors.

	static Manchester x;
	int data;

	private Manchester() {

	}

	public void msg() {
		System.out.println("Hello");
	}

	public static Manchester createObject() {
		if (x == null) {
			x = new Manchester();
		}
		return x;
	}
}
