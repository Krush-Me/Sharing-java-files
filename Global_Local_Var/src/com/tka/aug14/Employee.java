package com.tka.aug14;

public class Employee {

	int sal = 25000; 		// Global Var
	String Ename;			// Global Var
	
	public Employee() {
		System.out.println("This is non para Constructor");
	}
	
	int display() {
		int a = 90;				
		System.out.println(a);
		return a;
	}
	
	
	
	void m1(String s, double d1) {
		Employee e1 = new Employee();
		
		int a = e1.display();
			System.out.println(a);
			System.out.println(sal);
			
			System.out.println(s);
			System.out.println(d1);
			
	}
	
	
}

			// There are total 	
			// Global Var = 2;
			// Local Var = 8;  
			// String s, double d1, String[] args 
			// 		above are also local variables
