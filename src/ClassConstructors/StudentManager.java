package ClassConstructors;

import java.util.ArrayList;

public class StudentManager {
	private ArrayList<Student> students = new ArrayList<Student>();

	public void addStudent(Student s) {
		this.students.add(s);
	}

	public void removeStudent(Student s) {
		this.students.remove(s);
	}

//	public void changeID(int oldID, int updatedID) {
//		for (Student s : students) {
//			if(s.getStudentID()==(oldID)) {
//				students.set(students.indexOf(oldID), updatedID);
//			}
//		}
//
//	}
}