package org.greens.one;

public abstract class BankDetails {
	
	
	// non abstract method 
	
	public void bankCode() {
		System.out.println("bank code : 1234567");
	}
	
	public void bankBranch() {
		System.out.println("Chennai");
	}	
	
	// abstract method
	
	abstract void managerName();
	
	abstract void empName();
	
}
