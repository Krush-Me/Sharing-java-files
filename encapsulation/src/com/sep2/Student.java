package com.sep2;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	Student(int r, String n, int m){
		roll = r;
		name = n;
		marks = m;
	}
	
	public int getRoll(int OTP) {
		if (OTP == 1234) {
			return roll;
		} else {
			return 0;
		}
	}
	public void setRoll(int newRoll) {
		roll = newRoll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public int getMarks(){
		return marks;
	}
	public void setMarks(int newMarks) {
		marks = newMarks;
	}

}
