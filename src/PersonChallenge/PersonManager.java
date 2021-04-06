package PersonChallenge;

import java.util.ArrayList;

public class PersonManager {
	private ArrayList<Person> list = new ArrayList<Person>();
	
	public void addHuman(Person p) {
		this.list.add(p);
	}
}
