package com.qa.day6;

public class Main {

	public static void main(String[] args) {

		// Exceptions example one
		System.out.println("=======example one===========");
		int result = 0;
		int[] numbers = { 34, 56 };

		try {
			result = 4 / 4;
			System.out.println(numbers[3]);
		} catch (ArithmeticException x) {
			System.out.println("akljshdflkasjhgdas exception 1 line 1");
			System.out.println("askjldfhlaskjdfh exception 1 line 2");
		} catch (ArrayIndexOutOfBoundsException y) {
			System.out.println("alksdfja;sldfkj exception 2 line 1");
		}

		System.out.println("lkasdjflkjashd");
		System.out.println("als;kdjfa;lsdjf" + result);

		float x;

		float first = 5;
		float second = 2;
		float y = first / second;
		// parsed in int so division is floored even if the variable is a float
		x = 5 / 2;
		System.out.println(x);
		System.out.println(y);

		// ===========================================
		System.out.println("=====HSBC EXAMPLE ======");

		HSBC bank = new HSBC();
		bank.SalarySlip(2000, 12);

		System.out.println("========BANK EXAMPLE ====");
		Bank hsbc = new Bank();
		hsbc.deposit(100);
		try {
			hsbc.withdraw(299);
		} catch (WithdrawException E) {
			System.out.println("cant cant cant");
		}

		Bank barclays = new Bank();
		barclays.deposit(100);
		try {
			barclays.withdraw(200000);
		} catch (WithdrawException E) {
			System.out.println("nononononononon");
		}

	}

}
