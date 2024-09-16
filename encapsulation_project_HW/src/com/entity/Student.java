package com.entity;

public class Student {

	// All var start
	private int roll;
	private String sname;
	private int age;
	private String course;
	private long mob;
	private String addr;
	// All var end
	
	// ------- Constructors -------
	// Non para Constructor
	public Student() {
		
	}
	// Non para Constructor

	// All para Constructor
	public Student(int roll, String sname, int age, String course, long mob, String addr) {
		this.roll = roll;
		this.sname = sname;
		this.age = age;
		this.course = course;
		this.mob = mob;
		this.addr = addr;
	}
	// All para Constructor

	
	// -----all get & set methods start-----
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		if (roll > 0) {
			this.roll = roll;
		} else {
			System.out.println("roll cant be negative");
		}
		//this.roll = roll;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age <=45) {
			this.age = age;
		} else if(age > 45){
			System.out.println("age exceeded");
		} else {
			System.out.println("age cant be negative");
		}
		//this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		//this.mob = mob;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	// -----all get & set methods end-----

	
	// disp object instead memory add
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", age=" + age + ", course=" + course + ", mob=" + mob
				+ "]";
	}

	
	

	
	
}
