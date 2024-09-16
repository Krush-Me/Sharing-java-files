package com.task1;

public class Encap {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.matches("[a-zA-Z]+")) {
			this.name = name;
		} else {
			System.out.println("false input");
		}
		
		//this.name = name;
	}
	
	
}
