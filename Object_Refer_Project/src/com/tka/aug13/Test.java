package com.tka.aug13;

import com.tka.A;

public class Test {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//				s1.roll = 1;
//				s1.name = "Jay";
//		System.out.println(s1);
//		s1.display();

		Student s1;
		s1 = new Student();
		
		Student s2;
		s2 = new Student();
		
		
		A a1 = new A();

		s1 = a1.m1();
		s1.roll = 1;
		s1.name = "Jayram";
		
		s2 = a1.m1();
		s2.roll = 2;
		s2.name = "Pratik";
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1.display();
		s2.display();	
		
		
	}
	
}
