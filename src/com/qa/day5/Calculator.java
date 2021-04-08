package com.qa.day5;

import java.util.Scanner;

public class Calculator {

	public static double addition(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtraction(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		return num1 / num2;
	}

	public static double ask(double num1, double num2) {
		Scanner scan = new Scanner(System.in);
		Boolean flag = false;
		double toReturn = 0;

		do {
			System.out.println(
					"What do you want to do with these numbers? Addition, Subtraction, Multiplication, Division?");
			String s = scan.nextLine().toLowerCase();
			if (s.contains("multiplication")) {
				toReturn = multiplication(num1, num2);
				flag = true;
			}

			if (s.contains("division")) {
				toReturn = division(num1, num2);
				flag = true;
			}

			if (s.contains("addition")) {
				toReturn = addition(num1, num2);
				flag = true;
			}

			if (s.contains("subtraction")) {
				toReturn = subtraction(num1, num2);
				flag = true;
			}

		} while (!flag);
		return toReturn;
	}
}
