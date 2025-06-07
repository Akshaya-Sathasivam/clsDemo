package org.greens.one;

public class ClassA extends ClassB {

	public ClassA() { // default constructor/ non parameterized
		System.out.println("Constructor...");
	}

	public ClassA(int x) { // parameterized constructor
		System.out.println(x);
	}

	public ClassA(String y) { // parameterized constructor
		System.out.println(y);
	}

	public ClassA(char r) { // parameterized constructor
		System.out.println(r);
	}

	private void methodOne() {
		System.out.println("hello world");

	}

	public static void main(String[] args) {

		ClassA n = new ClassA();
//		ClassA n1 = new ClassA(345);
//		ClassA n2 = new ClassA("greens");
//		ClassA n3 = new ClassA('k');
		n.methodOne();

	}

}
