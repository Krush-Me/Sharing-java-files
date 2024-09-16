package positive_negative;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		Positive_Negative p = new Positive_Negative();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter NO: ");
//		
//				int num = sc.nextInt();
//		
//				boolean res = p.checkPositiveNegative(num);
//				
//			if (res) {
//				System.out.println("Positive No");
//			}	else {
//				System.out.println("Negative No");
//			}

		
		Positive_Negative p = new Positive_Negative();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no");
		
		int num = sc.nextInt();
		
		String res = p.checkPositiveNegative(num);
		
		System.out.println(res);
	}

}
