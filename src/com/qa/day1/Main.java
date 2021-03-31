package com.qa.day1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		Hello.method1();
		Hello.h2("Wee", "Woo");
		Hello.h3();

		System.out.println(Hello.h4());
//		Operators.operators();
		System.out.println(Calculator.addition(1, 2));
		System.out.println(Calculator.division(32, 3));
		Results.percentage(75, 75, 75);
		Results.result(3, 4, 5);
	}
}

//Variables are named in camelCase
//Class names are in PascalCase
//snake_case used for constants and final

// int num = 4;
// String str = "hiii";
// float price = 5.99f;
// boolean bool = true;
// char myLetter = "a";
// double doub = 232.7; (kind of combination of int and float)
// long l = 64l; (big integers)
// short s = 1s; 
