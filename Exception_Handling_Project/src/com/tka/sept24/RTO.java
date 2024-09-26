package com.tka.sept24;

import java.util.Scanner;

public class RTO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age: ");
		
		try {
			int age = sc.nextInt();
			sc.close();
			
			if (age >= 65) {
				//AgeTooHighException ag1 = new AgeTooHighException("age is too High...");
				try {
					AgeTooHighException e = new AgeTooHighException();
					throw e;
				} catch(AgeTooHighException e){
					e.printStackTrace();
					System.out.println("Your age is Too High...");
				}
				
			} else if(age <= 18) {
				//AgeTooLowException ag2 = new AgeTooLowException("age is too Low...");
				try {
					AgeTooLowException e = new AgeTooLowException();
					throw e;
				} catch(AgeTooLowException e) {
					e.printStackTrace();
					System.out.println("Your age is Too Low...");
				}
			} else {
				System.out.println("Congrats...You are Eligible...");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Enter valid number only.");
		}
		
		
	}

}
