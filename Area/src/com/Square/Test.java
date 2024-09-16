package com.Square;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Area a1 = new Area();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side of a Square = ");
		double side =	sc.nextDouble();
				
		double res = a1.areaOfSquare(side);
		System.out.println(res);
		
	}
}
