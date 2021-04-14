package com.qa.day8try2;

import java.sql.*;

public class Database {

	Connection con;
	Statement S;
	java.sql.PreparedStatement stm; //better due to storing compiled code - more efficient and also becuase it is safer (sqlinjection is not possible)
									//generally use prepared statement rather than statement

	public Database() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/QA", "root", "root"); // connects to
																							// database
																							// hosted on
																							// local machine
																							// - if not on
																							// local machine
																							// then change
																							// the arguments
			S = con.createStatement();
		} catch (Exception E) {
			System.out.println(E);
		}
	}

	public void insertRecord(int registrationNumber, String name, int marks) {
		try {
			S.executeUpdate("insert into student value(" + registrationNumber + ",'" + name + "'," + marks + ")"); // specific
																													// mysql
																													// syntax
		} catch (Exception E) {
			System.out.println(E);
		}
	}
	
	
	//insert record using prepared statements
	public void insertRecord2(int registrationNumber, String name, int marks) {
		try {
			stm = con.prepareStatement("insert into student value(?,?,?)");
			stm.setInt(1, registrationNumber);
			stm.setString(2, name);
			stm.setInt(3, marks);
		} catch (Exception E) {
			System.out.println(E);
		}
	}

	public void showRecords() {
		try {
			ResultSet records = S.executeQuery("select * from student"); // execute query used instead of execute update
																			// as this method requires a return of
																			// values from the database instead of just
																			// updating it like the insert method
			while (records.next()) // records.next returns true if there is a record at the next index starting
									// from BOF(beginning of file) ending at EOF(end of file) {
				System.out.println(records.getInt(1) + "..." + records.getString(2) + "..." + records.getInt(3)); // prints
																													// out
																													// onto
																													// the
																													// screen
																													// the
			// specific parts of the table
			// that was acquired from the
			// executequery.
		} catch (Exception E) {
			System.out.println(E);
		}

	}
	
	public void showRecords2(int id) {
		try {
			stm = con.prepareStatement("select * from customers where ID = ?");
			stm.setInt(1, id);
			ResultSet result = stm.executeQuery();
			result.next();
			result.getInt(1);
			result.getString(2);
			result.getInt(3);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateRecords(int registrationNumber, int updatedMarks) {
		try {
			// string required to match sql syntax to update an entry where input int is
			// equal to the registration number
			String sql = "update student set marks=" + updatedMarks + " where regnum=" + registrationNumber;
			S.executeUpdate(sql);
		} catch (Exception E) {
			System.out.println(E);
		}
	}

	//update records using prepared statements
	public void updateRecords2(int registrationNumber, int updatedMarks) {
		try {
			stm = con.prepareStatement("update student set marks=? where regnum=?");
			stm.setInt(1, updatedMarks);
			stm.setInt(2, registrationNumber);
			stm.executeUpdate();
		} catch (Exception E) {
			System.out.println(E);
		}
	}

	// have to be careful when deleting records
	public void deleteRecords(int registrationNumber) {
		try {
			String sql = "delete from student where regnum =" + registrationNumber; // string is the required sql syntax
																					// to delete an entry depending on
																					// registration number
			S.executeUpdate(sql);
		} catch (Exception E) {
			System.out.println(E);
		}
	}

	//delete records using prepared statements
	public void deleteRecords2(int registrationNumber) {
		try {
			stm = con.prepareStatement("delete from student where regnum=?");
			stm.setInt(1, registrationNumber);
			stm.executeUpdate();
		} catch (Exception E) {
			System.out.println(E);
		}
	}
}
