package com.aug16;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		Rectangle rc = new Rectangle();
//		int	b =	rc.area_rec(10,10);
//		System.out.println("Area of rectangle = " + b);
		
		Rectangle rc = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length = ");
		double length = sc.nextDouble();
		
		System.out.println("Enter breadth = ");
		double breadth = sc.nextDouble();
		
		double	result = rc.area_rec(length, breadth);
		System.out.println("Area of Rectangle = " + result);
		
	}
}
