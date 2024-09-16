package com.aug29;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Student.cname);		//TKA
						System.out.println("--------------");
		
		Student s1 = new Student(1, "Jay");		// s1 object 
				System.out.println(s1.roll);
				System.out.println(s1.name);
				System.out.println(s1.cname);  // TKA
						System.out.println("--------------");
				
				s1.cname = "JBK";
				System.out.println(s1.cname + " : updated cname");	//JBK
						System.out.println("--------------");
				// System.out.println(Student.roll);
				
		Student s2 = new Student(2, "Viru");	// s2 object
				System.out.println(s2.cname);  // JBK
						System.out.println("--------------");
				System.out.println(s2.roll + s2.name + s2.cname);
						System.out.println("--------------");
	}
	
}
