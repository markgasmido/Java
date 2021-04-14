package com.qa.day8try2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Generics example");
		Generics<Integer> ref1 = new Generics<Integer>();
		Generics<String> ref2 = new Generics<String>();
		ref1.msg(40);
		ref2.msg("askdjfhasdkf");

		System.out.println("Records Example");
		DatabaseExample db = new DatabaseExample();
		db.init();
		db.showAll();
		
		System.out.println("highest score");
		db.recordWithBestMarks();
		System.out.println("second highest score");
		db.secondHighestEntry2();
		System.out.println("lowest score");
		db.lowestScore();


	}

}
