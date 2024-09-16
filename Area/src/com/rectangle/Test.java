package com.rectangle;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Area a1 = new Area();
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length = ");
		double length =	sc.nextDouble();
		
		System.out.println("Enter Breadth = ");
		double breadth = sc.nextDouble();
		
		double result =	a1.areaOfrect(length, breadth);
		System.out.println(result);
	}
}
