package com.qa.day2;

public class FlowchartsIterations {
	public static void FlowChart1() {
		int num = 100;
		while (200 < num) {
			System.out.println("A");
			num++;
		}
	}

	public static void FlowChart2() {
		int A = 100;
		while (A <= 200) {
			if (A % 2 == 0) {
				System.out.println("-");
				A++;
			} else {
				System.out.println("*");
				A++;
			}
		}
	}

	public static void FlowChart3() {
		for (int count = 0; count < 11; count++) {
			System.out.println("1 2 3 4 5 6 7 8 9 10");
		}
	}

	public static void FlowChart1For() {
		for (int count = 0; count < 101; count++) {
			System.out.println("A");
		}
	}

	public static void FlowChart2For() {
		int A = 100;
		for (int count = 0; count < 101; count++) {
			if (A % 2 == 0) {
				System.out.println("-");
				A++;
			} else {
				System.out.println("*");
				A++;
			}
		}
	}

	public static void FlowChart5() {
		for (int count = 0; count < 11; count++) {
			int num = 0;
			while (num <= count) {
				switch (count + 1) {
				case 1:
					System.out.println("1");
					num++;
					break;
				case 2:
					System.out.println("2");
					num++;
					break;
				case 3:
					System.out.println("3");
					num++;
					break;
				case 4:
					System.out.println("4");
					num++;
					break;
				case 5:
					System.out.println("5");
					num++;
					break;
				case 6:
					System.out.println("6");
					num++;
					break;
				case 7:
					System.out.println("7");
					num++;
					break;
				case 8:
					System.out.println("8");
					num++;
					break;
				case 9:
					System.out.println("9");
					num++;
					break;
				case 10:
					System.out.println("10");
					num++;
					break;
				default:
					break;	
				}

			}
		}
	}
}
