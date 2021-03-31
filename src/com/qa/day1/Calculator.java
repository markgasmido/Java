package com.qa.day1;

public class Calculator {
	public static int addition(int firstInteger, int secondInteger) {
		int sumOfIntegers = firstInteger + secondInteger;
		return sumOfIntegers;
	}

	public static int subtraction(int firstInteger, int secondInteger) {
		int total = firstInteger + secondInteger;
		return total;
	}

	public static int multiplication(int firstInteger, int secondInteger) {
		int productOfIntegers = firstInteger * secondInteger;
		return productOfIntegers;
	}

	public static double division(double firstInteger, double secondInteger) {
		if (firstInteger > secondInteger) {
			double total = firstInteger / secondInteger;
			return total;
		}
		else {
			System.out.println("This division cannot be performed as the first integer is smaller than the second");
			return 0;
		}
	}
}
