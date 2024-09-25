package q4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

//		PrimeNum pn = new PrimeNum(6);		// if we write constructor and pass value through it

//		PrimeNum pn = new PrimeNum();
//		pn.checkPrime(19);
//		pn.checkPrime(75);
//		pn.checkPrime(19);
//		pn.checkPrime(97);

		
		/*---	Taking input from user	*/
//		Scanner sc = new Scanner(System.in);
//		PrimeNum pn = new PrimeNum();
//		System.out.println("Enter no to check Prime or not:");
//		int num = sc.nextInt();
//		pn.checkPrime(num);
//		sc.close();
		
		
		/*---	Displaying Prime numbers from given range (PrimeCheck() & displayPrime())	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting num: ");
		int start = sc.nextInt();
		System.out.println("Enter Last num: ");
		int end = sc.nextInt();
		PrimeNum pn = new PrimeNum();
		pn.displayPrime(start, end);
		
		sc.close();
	}

}
