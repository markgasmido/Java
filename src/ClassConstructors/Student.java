package ClassConstructors;

public class Student {
	private int studentID;
	private String firstName;
	private String lastName;
	private int classNumber;
	private String schoolName;

	// constructor method that requires no paramenters - don't really know what this
	// does
	public Student() {

	}

	// constructor method that requires 4 different parameters
	public Student(int ID, String fName, String lName, int cNumber) {
		this.classNumber = cNumber;
		this.firstName = fName;
		this.lastName = lName;
		this.studentID = ID;
	}

	// constructor method that requires 1 parameter
	public Student(String sName) {
		this.schoolName = sName;
	}

	// get first name
	public String getFirstName() {
		return this.firstName;
	}

	// get last name
	public String getLastName() {
		return this.lastName;
	}

	// get student id
	public int getStudentID() {
		return this.studentID;
	}

	// method that returns formatted string of all of the details in the student
	// class
	public String toString() {
		String toReturn = "Student ID: " + this.studentID + "/n" + "Student Name: " + this.firstName + " "
				+ this.lastName + "/n" + "Class Number: " + this.classNumber + "/n" + "School: " + this.schoolName;
		return toReturn;
	}

}
