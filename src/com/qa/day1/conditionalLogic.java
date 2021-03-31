package com.qa.day1;

public class conditionalLogic {
	public static int flowCharts1(int firstInteger, int secondInteger, boolean bool) {
		if (bool) {
			int total = firstInteger + secondInteger;
			return total;
		} else {
			int total = firstInteger * secondInteger;
			return total;
		}
	}

	public static void flowCharts2(int A) {
		if (A > 2000) {
			System.out.println(A);
			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}

	}
}
