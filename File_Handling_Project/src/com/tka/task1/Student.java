package com.tka.task1;

import java.io.Serializable;

public class Student implements Serializable {

	private int id;
	private String name;
	private int age;
	private String course;
	private long mobile;

	public Student() {
		super();
	}

	public Student(int id, String name, int age, String course, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	public long getMobile() {
		return mobile;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}

}
