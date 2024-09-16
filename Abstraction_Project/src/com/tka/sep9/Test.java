package com.tka.sep9;

public class Test {

	public static void main(String[] args) {
		
		// A a1 = new A();
		
		B b1 = new B();
		System.out.println(b1.m1());
		System.out.println(b1.m2());
		System.out.println(b1.d);
		
		A.skipEMI();
		b1.m4();
		
		A obj1 = new B();
			
		
	}

}
