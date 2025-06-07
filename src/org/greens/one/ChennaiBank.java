package org.greens.one;

public abstract class ChennaiBank {

	// non abstract method

	public void chennaiCode() {
		System.out.println("Chennai Code : 12345");
	}

	public void chennaiRef() {
		System.out.println("Ref : Vadapalani");
	}

	// abstract method

	abstract void interestRate();

	abstract void homeInterest();

}
