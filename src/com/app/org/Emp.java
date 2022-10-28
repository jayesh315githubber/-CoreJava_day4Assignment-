package com.app.org;

import java.util.Iterator;


import com.exception.firstnameLastnameSameException;
import com.exception.invalidIDBoundException;

public abstract class Emp {
	private int id;
	private String firstName;
	private String lastName;
	private int deptID;
	private double basic;
	private static int counter;

	static {
		counter = 1000;
	}

	public Emp(String firstName, String lastName, int deptID, double basic) {
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptID = deptID;
		this.basic = basic;
		counter++;
	}
	public Emp(String firstName) {
		this.firstName=firstName;
	}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDeptID() {
		return deptID;
	}

	public double getBasic() {
		return basic;
	}

	public static int getCounter() {
		return counter;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public static void setCounter(int counter) {
		Emp.counter = counter;
	}

	@Override
	public String toString() {
		return "ID: " + id + " firstName: " + firstName + " lastName: " + lastName + " deptID: " + deptID;
	}

	public abstract double computeNetSalary();

	/*
	 * public boolean equals(Emp[] empinfo) {
	 * 
	 * for (int i = 0; i < empinfo.length; i++) {
	 * 
	 * if(empinfo[i] instanceof Mgr) return
	 * this.firstName.equals(((Mgr)empinfo[i]).getFirstName()); else if(empinfo[i]
	 * instanceof Worker) return
	 * this.firstName.equals(((Worker)empinfo[i]).getFirstName()); //return
	 * this.chasisNo.equals(((Vehicle) anotherVehicle).chasisNo); } return false; }
	 */

	/*
	 * public String unique(String lastname) throws firstnameLastnameSameException {
	 * 
	 * if (firstName.equals(lastname)) { return lastname; } else { throw new
	 * firstnameLastnameSameException("Firstname and lastname should not be same.");
	 * } }
	 */
	
	/*
	 * public String unique(String firstname , String lastname) throws
	 * firstnameLastnameSameException {
	 * 
	 * if (firstName.equals(lastname)) { return lastname; } else { throw new
	 * firstnameLastnameSameException("Firstname and lastname should not be same.");
	 * } }
	 */
	
	/*
	 * public String equals(String str) throws invalidIDBoundException {
	 * System.out.println("in vehicle's equals"); //if (anotherVehicle instanceof
	 * Mgr) if (this.firstName.equals(str)) throw new
	 * invalidIDBoundException("invalid lastname"); //=> not a vehicle return (str);
	 * }
	 */
	@Override
	public boolean equals(Object anotherEmp) {
		System.out.println("in Emp's equals");
		if (anotherEmp instanceof Mgr)
			return this.firstName.equals(((Emp)anotherEmp).firstName);
		//=>  not a vehicle
		return false;
	}

}
