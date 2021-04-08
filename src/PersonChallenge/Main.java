package PersonChallenge;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person mark = new Person("Mark", 23, "Learning");
		Person steve = new Person("Steve", 25, "Shop");
		

		System.out.println(mark.toString());
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(mark);
		list.add(steve);
		
//		System.out.println(list);
		
		Person test = new Person();
		test = test.who("Mark");
		System.out.println(test);
		
		mark.menu();
	}

}
