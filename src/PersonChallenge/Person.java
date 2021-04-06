package PersonChallenge;

import java.util.ArrayList;

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

}
