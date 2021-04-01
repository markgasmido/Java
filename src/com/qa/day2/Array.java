package com.qa.day2;

public class Array {
	public static void EnhancedForLoop() {
		String[] arr = { "wee", "woo", "woowee", "weewoo" };
		for (String str : arr) {
			System.out.println(str);
		}
	}

	public static void EnhancedForLoop2() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int intint : arr) {
			int timesTen = intint * 10;
			System.out.println(timesTen);
		}
	}

	public static boolean EnhancedForLoop3(int integer) {
		if (integer % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void EnchancedForLoop4() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for(int intint : arr) {
			if (intint % 2 == 0) {
				int weOutHere = intint * intint * intint * intint;
				System.out.println(weOutHere);
			} else {
				int weOutHere = intint * intint;
				System.out.println(weOutHere);
			}
		}
	}
}
