package com.tka.sept23;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println(10 / 5);
		
		System.out.println(10 / 3);
		
		try {
			System.out.println(10 / 0);		//	ArithmeticException
		} 
		catch(ArithmeticException e) {
			System.out.println("Infinity");
			e.printStackTrace();
		}
		
		System.out.println(10 / 2);
		
		System.out.println(10 / 4);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no: ");
//			int num = sc.nextInt();
		
		
//		int[] a = new int[3];
//		System.out.println(a[4]);		//	ArrayIndexOutOfBoundsException
		
		
		
	}

}
