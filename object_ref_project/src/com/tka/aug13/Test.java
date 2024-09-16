package com.tka.aug13;

import com.tka.aug13.std.A;

public class Test {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		System.out.println(s1);
		
		Student s1;
		s1 = new Student();
		
//		A a1 = new A();
		A a1;
		a1 = new A();
		
		s1 = a1.m1();
		s1.roll = 1;
		s1.name = "ABC";
		
		System.out.println(s1);
		
		s1.display();
	}
}
