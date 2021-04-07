package com.qa.day1;

public class Results {

	private int physics;
	private int chemistry;
	private int biology;
	private int total;
	private int percentage;
	
	
	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.biology = biology;
		this.chemistry = chemistry;
//		this.percentage = percentage;
//		this.total = total;
	}
	public void result() {
		int total = this.physics + this.chemistry + this.biology;
		this.total = total;
		System.out.println("This student achieved a score of :" + this.physics + " in Physics");
		System.out.println("This student achieved a score of :" + this.chemistry + " in Chemistry");
		System.out.println("This student achieved a score of :" + this.biology + " in Biology");
		System.out.println("This student has a final score of : " + total);
	}

	public void percentage() {
		boolean flag = false;
		int count = 0;

		if (this.physics < 90) {
			flag = true;
			count++;
		}
		if (this.chemistry < 90) {
			flag = true;
			count++;
		}
		if (this.biology < 90) {
			flag = true;
			count++;
		}

		this.total = physics + chemistry + biology;
		double percentage = (total * 100) / 450;
		this.percentage = (int) percentage;
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
