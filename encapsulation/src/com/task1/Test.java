package com.task1;

public class Test {

	public static void main(String[] args) {
		
		Encap e1 = new Encap();
		
			e1.setName("jAy");
			System.out.println("case1: " + e1.getName());
			
			e1.setName("Jay123");
			
			e1.setName("Jay@");
			
			e1.setName("vir123y");
			
			e1.setName("j+y");
			
			e1.setName("jAy");
			
			e1.setName("JAY");
			
			System.out.println(e1.getName());
	}

}
