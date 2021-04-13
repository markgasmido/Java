package com.qa.day6;

public class Exceptions {

	int result = 0;
	int[] numbers = { 34, 56 };
	{

		try {
			result = 4 / 4;
			System.out.println(numbers[3]);
		} catch (ArithmeticException x) {
			System.out.println("akljshdflkasjhgdas exception 1 line 1");
			System.out.println("askjldfhlaskjdfh exception 1 line 2");
		} catch (ArrayIndexOutOfBoundsException y) {
			System.out.println("alksdfja;sldfkj exception 2 line 1");
		}

	}
}