package com.tka.sep11;

import com.tka.entity.Student;

public class Logical {

	public static int maxNum(int[] marks) {
		int topper = marks[0];
		
		for (int i = 0; i<marks.length; i++) {
			if(marks[i]> topper) {
				topper = marks[i];
			}
		}
		return topper;
	}
	
	
	public static int minNum(int[] marks) {
		int lower = marks[0];
		for(int i =0; i<marks.length; i++) {
			if(marks[i]< lower) {
				lower = marks[i];
			}
		}
		return lower;
	}
	
//	public static Student[] getAllStudents() {
//		Student[] db = new Student[5];
//		
//		db[0] = new Student(1, "Jay", 78);
//		db[1] = new Student(2, "Viru", 52);
//		db[2] = new Student(3, "Sham", 92);
//		db[3] = new Student(4, "Naman", 99);
//		db[4] = new Student(5, "Ram", 30);
//		
//		return db;
//	}
	
	
	
}
