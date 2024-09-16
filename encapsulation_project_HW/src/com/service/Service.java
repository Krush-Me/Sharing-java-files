package com.service;

import com.entity.Student;

public class Service {

	public Student m1() {
//		Student s1 = new Student(11,"Viru",25,"AWS",1600245120,"XYZ...");
//		return s1;  
		
		return new Student(11,"Viru",25,"AWS",1600245120,"XYZ...");
	}
	
	public Student m2() {
		return new Student();
	}

}
