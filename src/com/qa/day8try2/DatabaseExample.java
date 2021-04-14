package com.qa.day8try2;

public class DatabaseExample {
	Record[] recs = new Record[3];

	public void init() {
		recs[0] = new Record();
		recs[1] = new Record();
		recs[2] = new Record();

		recs[0].regno = 45;
		recs[0].name = "marki";
		recs[0].address = "uk";
		recs[0].marks = 3;

		recs[1].regno = 145;
		recs[1].name = "1marki";
		recs[1].address = "1uk";
		recs[1].marks = 2;

		recs[2].regno = 245;
		recs[2].name = "2marki";
		recs[2].address = "2uk";
		recs[2].marks = 1;

	}

	public void showAll() {
		for (int i = 0; i < recs.length; i++) {
			displayRecord(recs[i]);
		}
	}

	private void displayRecord(Record rec) {
		System.out.println("Regno:" + rec.regno);
		System.out.println("Name:" + rec.name);
		System.out.println("Address:" + rec.address);
		System.out.println("Marks:" + rec.marks);
	}

	public void recordWithBestMarks() {
//		int top = 0;
		int index = 0;

		for (int i = 0; i < recs.length; i++) {
			if (recs[i].marks > recs[index].marks) {
//				top = recs[i].marks;
				index = i;
			}
		}
		displayRecord(recs[index]);

	}

	public void secondHighestEntry() {
		int first = 0;
		int second = 0;
		int index2 = 0;

		// find highest
		for (int i = 0; i < recs.length; i++) {
			if (recs[i].marks > first) {
				first = recs[i].marks;
			}
		}

		// find second highest
		for (int i = 0; i < recs.length; i++) {
			if (recs[i].marks > second && recs[i].marks < first) {
				second = recs[i].marks;
				index2 = i;
			}
		}

		displayRecord(recs[index2]);
	}

	public void secondHighestEntry2() {
		int index = 0;
		int index2 = 0;
		int highest = 0;
		int secondHighest = 0;

		for (int i = 0; i < recs.length; i++) {
			if (recs[i].marks > highest) {
				secondHighest = highest;
				index2 = index;
				highest = recs[i].marks;
				index = i;
			} else {
				if (recs[i].marks > secondHighest) {
					secondHighest = recs[i].marks;
					index2 = i;
				}
			}
		}
		displayRecord(recs[index2]);
	}
	
	//cant get this to work lol
	public void secondHighestEntry3() {
		int index = 0;
		int index2 = 0;


		for (int i = 0; i < recs.length; i++) {
			if (recs[i].marks > recs[index].marks) {
				index2 = index;
				index = i;
			} else {
				if (recs[i].marks > recs[index2].marks) {
//					secondHighest = recs[i].marks;
					index2 = i;
				}
			}
		}
		displayRecord(recs[index2]);
	}

	public void lowestScore() {
//		int score = 0;
		int index = 0;

		for (int i = 0; i < recs.length; i++) {
			if (recs[i].marks < recs[index].marks) {
//				score = recs[i].marks;
				index = i;
			}
		}
		displayRecord(recs[index]);
	}
}