package org.greens.one;

import org.greens.two.*;

public class EmployeeDetails extends CompanyDetails {
	// child cls
	private void empName() {
		System.out.println("Empname : XXXX");
	}
	
	private void empContact() {
		System.out.println("EmpContact : 9876543223");
	}
	
	private void empAddress() {
		System.out.println("EmpAddress : Chennai");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails	details = new EmployeeDetails();
		details.empName();
		details.empContact();
		details.empAddress();
		details.companyArea();
		details.companyName();
	}
}
