package com.tka.sep11;

import java.util.Scanner;

import com.tka.entity.Student;

public class Example {

	public static void main(String[] args) {

//		int[] marks = {77,88,99,66,91};

//		System.out.println("size/length of array: " + marks.length);  // prints length of array
//		
//		System.out.println("Value at index: " + marks[3]);  // indexing starts from count 0
//		
//		System.out.println("marks in array: " + marks);	// prints all marks

//		for (int i=0; i<marks.length; i++) {
//		//System.out.println(marks[i]);		// all marks
//		
//		if(marks[i] > 90) {	
//			System.out.println("marks above 90: " + marks[i]);
//		}
//		
//		if (marks[i] % 2 == 0) {		
//			System.out.println(marks[i]);	// even marks
//		}

//		int topper = marks[0];
//		for (int i = 0; i<marks.length; i++) {
//			if (marks[i]> topper) {
//				topper = marks[i];
//			}
//		}
//			System.out.println("Topper marks: " + marks[j]);

//			int topper = Logical.maxNum(marks);
//			System.out.println("Topper: " + topper);
//			
//			int lower = Logical.minNum(marks);
//			System.out.println("Lower: " + lower);

		
		
//		Student[] studentsdb = Logical.getAllStudents();
//
//		for (int i = 0; i < studentsdb.length; i++) {
//
//			// System.out.println(studentsdb[i]);	//print all students details
//
//			// System.out.println(studentsdb[i].getMarks());
//			
//			if (studentsdb[i].getMarks() > 90) {
//				System.out.println(studentsdb[i] + " marks: " + studentsdb[i].getMarks());		//above 90 marks 
//			}
//			
//		}
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of elements: ");
		int size = sc.nextInt();
		
		Student[] db = new Student[size];
		for (int i = 0; i <db.length ; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

         // Get student roll
            System.out.print("Roll: ");
            int roll = sc.nextInt();
            
         // Get student name
            System.out.print("Name: ");
            String name = sc.next();
            
         // Get student Marks
            System.out.println("Marks: ");
			int marks = sc.nextInt();

            db[i] = new Student(roll, name, marks);
        }
		
		System.out.println("\nStudent Details: ");
		for(int i=0; i<db.length; i++) {
			System.out.println(db[i]);
		}
		sc.close();
		
	}
}
