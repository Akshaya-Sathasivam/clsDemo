package org.greens.one;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
public  class ClassB{
	
	
	
	public ClassB() {
		System.out.println("constructor..");
	}
	
	private static ClassB getObject() {
		if(var == null ) {
			System.out.println(System.identityHashCode(var));
			var = new ClassB();
			System.out.println(System.identityHashCode(var));
		}
		return var;
	}
	
	private void methodOne() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		
		ClassB object = getObject();
		System.out.println(System.identityHashCode(object));
		ClassB object1 = getObject();
		System.out.println(System.identityHashCode(object1));
		ClassB object2 = getObject();
		System.out.println(System.identityHashCode(object2));
		
		
		object.methodOne();
		object1.methodOne();
	}
}
