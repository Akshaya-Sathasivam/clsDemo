package org.greens.one;

public class SubClassA extends BankDetails{

	@Override
	void managerName() {
		System.out.println("xxxx");
	}
	
	
	@Override
	void empName() {
		System.out.println("empName : yyyy");
	}
	
	public static void main(String[] args) {
		
		SubClassA n = new SubClassA();
		n.bankBranch();
		n.empName();
		n.bankCode();
		n.managerName();
		
	}
	
}
