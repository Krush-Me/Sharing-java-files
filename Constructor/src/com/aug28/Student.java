package com.aug28;

public class Student {

	 public int roll;
	 public String name;
	 public int marks;
	 
	 public Student() {
		 System.out.println("this is non para constructor");
	 }
	 
	 public Student(int r) {
		 System.out.println("this is onecpara constructor");
		 roll = r;
	 }
	 
	 public Student(int r, String n) {
		 System.out.println("this is two para constructor");
		 roll = r;
		 name = n;
	 }
	 
	 public Student(int r, String n, int m) {
		 System.out.println("This is Parameterized Constructor");
		 System.out.println("Object is initializing");
		 roll = r;
		 name = n;
		 marks = m;
		 System.out.println("Initialzation over...");
	 }
	 

	 public void display() {
		 System.out.println(" Student roll: " + roll);
		 System.out.println(" Student name: " + name);
		 System.out.println(" Student marks: " + marks);
		 System.out.println("roll + marks: " + (roll + marks));
		 System.out.println("--------------------");
	 }
}
