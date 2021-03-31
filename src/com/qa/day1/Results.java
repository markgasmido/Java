package com.qa.day1;

public class Results {

	int physics;
	int chemistry;
	int biology;
	int total;
	int percentage;

	public static void result(int physics, int chemistry, int biology) {
		int total = physics + chemistry + biology;
		System.out.println("This student achieved a score of :" + physics + " in Physics");
		System.out.println("This student achieved a score of :" + chemistry + " in Chemistry");
		System.out.println("This student achieved a score of :" + biology + " in Biology");
		System.out.println("This student has a final score of : " + total);
	}

	public static void percentage(int physics, int chemistry, int biology) {
		boolean flag = false;
		int count = 0;

		if (physics < 90) {
			flag = true;
			count++;
		}
		if (chemistry < 90) {
			flag = true;
			count++;
		}
		if (biology < 90) {
			flag = true;
			count++;
		}

		int total = physics + chemistry + biology;
		double percentage = (total * 100) / 450;
		System.out.println("The exam percentage that this student achieved was: " + percentage + "%");
		if (flag && count == 1) {
			System.out.println(
					"The passing mark is 60%. Student has failed the test as  they have failed one test.");
		}
		if (flag && count == 2) {
			System.out.println(
					"The passing mark is 60%. Student has failed the test as  they have failed two tests.");
		}
		if (flag && count == 3) {
			System.out.println(
					"The passing mark is 60%. Student has failed the test as  they have failed three tests.");
		}
	}
}
