package com.tka.sept26;

import java.io.Serializable;

public class Student implements Serializable {

	private int roll;
	private String name;
	private String email;
	transient private String pass;

	public Student() {
		super();
	}

	public Student(int roll, String name, String email, String pass) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", pass=" + pass + "]";
	}

	

}
