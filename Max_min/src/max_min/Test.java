package max_min;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		MaxMin max = new MaxMin();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd no ");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd no ");
		int c = sc.nextInt();

		int res = max.checkMaxMin(a, b, c);
		
		
	}

}
