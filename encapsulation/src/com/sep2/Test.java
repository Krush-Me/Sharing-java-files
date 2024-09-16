package com.sep2;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Jay",80);
		System.out.println(s1);
		
		
			System.out.println("Roll: " +s1.getRoll(1234));
				s1.setRoll(50);
				System.out.println("updated roll: " +s1.getRoll(1234));
			
			System.out.println("name: " + s1.getName());
				s1.setName("Viru");
				System.out.println("updated name: " + s1.getName());
			
				
	}

}
