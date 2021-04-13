package com.qa.day6;

public class Bank {
	int balance;

	public void deposit(int amount) {
		balance += amount;
	}

	public void showBalance() {
		System.out.println("Your current balance is: " + balance);
	}

	public void withdraw(int amount) throws WithdrawException {
		if (amount > balance) {
			WithdrawException E = new WithdrawException();
			throw E;
		} else {
			balance -= amount;
		}
	}
}
