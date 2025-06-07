package org.greens.one;

public class ClassD  {

	public static void main(String[] args) {
		
		ClassB n = new ClassB();
		n.setId(123);
		int id = n.getId();
		System.out.println(id);
		
		ClassB n1 = new ClassB();
		n1.setName("greens");
		String id1 = n1.getName();
		System.out.println(id1);
	
		
	}
	
}
