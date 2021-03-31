package com.qa.day1;

public class Operators {

	public static void operators() {

		////////////////////////////
		// Assingment Operation (=)
		int i = 0;

		////////////////////////////
		// Arithmetic Operators
		int i2 = 3 + 3; // addition
		int i3 = 3 - 3; // subtraction
		int i4 = 3 * 3; // multiplication
		int i5 = 3 / 3; // division

		////////////////////////////
		// modulo what?
		// This is a way of finding odd and even values. Only works when you modulo by 2
		//////////////////////////// - <num> % 2
		int i6 = 4 % 2; // 0 - it's even
		int i7 = 5 % 2; // 1 - it's odd

		////////////////////////////
		// Unary Operators
		// +, -, ++, --, !
		int i8 = +934; // equivalent to "i8 = 934"
		int i9 = -45; // negative number

		int i10 = 10;
		i10++;
		System.out.println(i10);
		i10--;
		System.out.println(i10);

		boolean b = true;
		boolean a = !b;
		System.out.println(a); // false
		System.out.println(!true); // false

		////////////////////////////
		// Compound Assignment Operators - a shortcut operator
		// +=, -=, *=, /=, %=,!=
		// do operation
		// then do this assignment

		// +=
		int f = 3;
		f += 3; // f = f + 3;
		System.out.println(f);

		f -= 3; // 3
		System.out.println(f);

		f *= 3; // 9
		System.out.println(f);

		f /= 3; // 3
		System.out.println(f);

	}
}
