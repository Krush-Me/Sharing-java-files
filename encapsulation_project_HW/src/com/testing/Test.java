package com.testing;

import com.entity.Student;
import com.service.Service;

public class Test {

	public static void main(String[] args) {
			
			// obj 1
		Service serv1 = new Service();
				Student s1 = serv1.m1();
			System.out.println(s1);
			
			// obj 2
		Service serv2 = new Service();	
				Student s2 = serv2.m2();
				s2.setRoll(-5);
				s2.setSname("Rohit");
				s2.setAge(50);
				s2.setCourse("Dot Net");
				s2.setMob(1234567890);
			System.out.println(s2);
			
	}

}
