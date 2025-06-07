package org.greens.one;

public class ClassException extends Exception{
	
	public ClassException() {
	System.out.println("ClassException");
	}
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}
	

}
