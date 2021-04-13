package com.qa.day6;

public class HSBC {
	public void SalarySlip(int salary, int absenties) {
		float tax = salary * 30 / 100;
		try {
			if (absenties > 10) {
				AbsentiesException ref = new AbsentiesException();
				throw ref;
			}
		} catch (AbsentiesException t) {
			System.out.println("aksljdfhaslkgjh");
		}
		System.out.println("your tax is:" + tax);
	}
}
