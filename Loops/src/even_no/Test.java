package even_no;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		

		// Print all even no form 99 to 78
//		for(int i = 99; i>=78; i--) {
//			if(i%2==0) {
//				System.out.println(i);
//				
//			}
//		}
		// Print all even no form 99 to 78
		
		
		
		// Print Table of 5
//		for (int i=5; i<=50; i+=5) {
//			System.out.println(i);
//		}
		//print table of 5
		
		//print table of 5
//		for (int i=1; i<=10; i++) {
//			System.out.println(5 + "*" + i + " = " + 5*i);
//		}
		//print table of 5
		
		
		
		// code for to accept one no from user and disp table
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter table u want : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i <=10; i++) {
//			System.out.println(num + "*" + i + " = " + num*i );
//		}
		// code for to accept one no from user and disp table
		
		
		// Accept two no from user and display all tables betwn them
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter 1st no u want to start table :");
//		int num1 = sc.nextInt();
//		
//		System.out.println("Enter last no u want to End table :");
//		int num2 = sc.nextInt();
//		
//		
//		//	if no given like 5 to 2 then can swap and print 2 to 5
//		//		if(num1>num2) {
//		//			int temp;
//		//			temp = num1;
//		//			num1 = num2;
//		//			num2 = temp;
//		//		}
//		
//		for (int i=num1; i<=num2; i++) {
//			System.out.println("Table of " + i + ":");
//			
//			for (int j=1; j<=10; j++) {
//				System.out.println(i + "*" + j + " = " + i*j);
//			}
//			System.out.println();
//		}
//		sc.close();
		// Accept two no from user and display all tables betwn them
		
		
		
	// if 1st no is bigger than 2nd no	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd no : ");
		int  num2 = sc.nextInt();
		
		if (num1<=num2) {
			for (int i=num1; i<=num2; i++) {
				System.out.println("Multiplication of " + i + ":");
				
				for (int j=1; j<=10; j++) {
					System.out.println( i + " * " + j + " = " + (i*j));
				}
				System.out.println();
			}
		}	else {
			for (int i=num1; i>=num2; i--) {
				System.out.println("Multiplication of " + i + ":");
				
				for (int j=1; j<=10; j++) {
					System.out.println( i + " * " + j + " = " + (i*j));
				}
				System.out.println();
			}
		}
		sc.close();
	// if 1st no is bigger than 2nd no
		
	}

}
