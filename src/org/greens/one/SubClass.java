package org.greens.one;

public class SubClass extends ChennaiBank{

	@Override
	void interestRate() {
		System.out.println("interest rate : 10%");
	}

	@Override
	void homeInterest() {
		System.out.println("homeloan : 20%");
	}
	
	public static void main(String[] args) {
		SubClass cls = new SubClass();
		cls.chennaiCode();
		cls.chennaiRef();
		cls.interestRate();
		cls.homeInterest();
		
	}
	
	
	

}
