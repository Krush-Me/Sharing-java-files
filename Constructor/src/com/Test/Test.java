package com.Test;

import com.aug28.Student;

public class Test {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//			s1.display();
//			s1.roll= 1;
//			s1.name = "Jay";
//			s1.marks = 80;
//			s1.display();
			
		Student s1 = new Student(1,"Jay",80);
			s1.display();
			
		Student s2 = new Student();
			s2.display();
		
		Student s3 = new Student(5);
			s3.display();
			
		Student s4 = new Student(2,"Viru");
			s4.display();	
	}
	
}
