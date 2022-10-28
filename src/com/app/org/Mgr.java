package com.app.org;

/*id,name,basic,deptId , perfBonus
Behaviour ----1. get mgr details :  using toString*/
public class Mgr extends Emp{
	
	private double perfBonus;
	private double netSalary;

	public Mgr(String firstName) {
		super(firstName);
	}
	
	public Mgr(String firstName,String lastName,int deptID,double basic,double perfBonus) {
		super(firstName, lastName, deptID, basic);
		this.perfBonus=perfBonus;
	}
	
	@Override
	public double computeNetSalary() {
		netSalary=super.getBasic()+perfBonus;
		return netSalary;
	}

	public double getPerfBonus() {
		return perfBonus;
	}
	
	public double getNetSalary() {
		return computeNetSalary();
	}
	
	@Override
	public String toString() {
		return "Manager Details: "+super.toString()+"Performance Bonus: "+perfBonus;
	}
	

}
