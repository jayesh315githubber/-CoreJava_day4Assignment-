package com.app.org;
//id,name,basic,deptId,hoursWorked,hourlyRate
//Behaviour--- 
//1. get worker details -- :  override toString.
//2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
//3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)

public class Worker extends Emp {
	
	private int hoursWorked;
	private double hourlyRate;
	private double netSalary;

	
	public Worker(String firstName,String lastName,int deptID,double basic,int hoursWorked,double hourlyRate) {
		super(firstName, lastName, deptID, basic);
		this.hoursWorked=hoursWorked;
		this.hourlyRate = hourlyRate;
		
	}
	
	public double computeNetSalary() {
		netSalary=super.getBasic()+(hoursWorked*hourlyRate);
		return netSalary;
	}

	public double getPerfBonus() {
		return hourlyRate;
	}
	
	public double getNetSalary() {
		return computeNetSalary();
	}


	@Override
	public String toString() {
		return "Worker Details: "+super.toString()+"Hours Worked: "+hoursWorked;
	}
	
	

}
