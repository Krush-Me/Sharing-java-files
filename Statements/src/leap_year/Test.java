package leap_year;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		Leap_Year l = new Leap_Year();
//					boolean res = l.checkLeapYear(1900);
//
//					if (res) {
//						System.out.println("It's a Leap Year");
//					}	else {
//						System.out.println("Not a leap Year");
//					}
		
		
		Leap_Year ly = new Leap_Year();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year : ");
		
			int year = sc.nextInt();
				
			boolean isLeap = ly.checkLeapYear(year);
				
			if(isLeap) {
				System.out.println(year + " is a Leap year");
			}	else {
				System.out.println(year + " is not Leap year");
			}
				
	}

}
