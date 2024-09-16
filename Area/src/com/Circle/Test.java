package com.Circle;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Area a1 = new Area();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius = ");
		double radius = sc.nextDouble();
		
		double result = a1.areaOfCircle(radius);
		System.out.println("Area of Circle is : " + result);
	}
}
