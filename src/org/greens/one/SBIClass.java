package org.greens.one;

public class SBIClass implements InterestRate,Interface1{

	@Override
	public void homeLoan() {
		System.out.println("homeloan : 10%");
	}
	@Override
	public void vehicleLoan() {
		System.out.println("vehicle : 2%");
	}
	@Override
	public void goldLoan() {
		System.out.println("goldloan : 10%");
	}
	@Override
	public void methodOne() {
		System.out.println("methodone");
	}
	public static void main(String[] args) {
		SBIClass n = new SBIClass();
		n.homeLoan();
		n.vehicleLoan();
		n.goldLoan();
		n.methodOne();
	}
}