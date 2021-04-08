package PersonChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	private ArrayList<Person> list = new ArrayList<Person>();

	public String toString() {
		String toReturn = "Name: " + name + "\n" + "Age: " + age + "\n" + "Job title: " + jobTitle + "\n";
		return toReturn;
	}

	public Person() {

	}

	// constructor - called when we instantiate an object of the class
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return this.name;
	}

//	public void who(String name) {
//		if (list.contains(name)) {
//			int index1 = list.indexOf(name);
//			System.out.println("Name: " + list(index1));
//		} else {
//			System.out.println("No matches");
//		}
//
//	}

	public Person who(String name) {
		for (Person person : list) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		return null;
	}

	public void menu() {
		Scanner s = new Scanner(System.in);
//		boolean sss = false;

		System.out.println(
				"What do you want to do?\n 1. Create person \n 2. Output all people to console \n 3. Search for specific person \n Please input the number you want to execute.");
		int ss = s.nextInt();

//		if (sss) {
		if (ss == 1) {
			System.out.println("Creating person. Please enter the name, age and job title.");
			String namePerson = s.nextLine();
			int agePerson = s.nextInt();
			s.nextLine(); // catch enter
			String jobTitlePerson = s.nextLine();
			// Person(namePerson, agePerson, jobTitlePerson);

		} else if (ss == 2) {
			System.out.println("Printing all of the people in the list.");
			for (Person person : list) {
				System.out.println(person.name);
			}

		} else if (ss == 3) {

			System.out.println("Who do you want to search for?");
			s.nextLine(); //catch enter
			String namePerson = s.nextLine();
			System.out.println("Searching");
			if(who(namePerson) != null) {
				System.out.println(who(namePerson));
			} else {
				System.out.println("Person not found in the list.");
			}
		} else {
			System.out.println("Invalid entry please try again");
		}
	}
//	}

}
