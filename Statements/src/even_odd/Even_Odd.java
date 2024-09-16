package even_odd;

public class Even_Odd {

	void checkEvenOdd(int num) {
		
		if (num % 2 == 0) {
			System.out.println("No. is Even");
		}	else {
			System.out.println("No. is Odd");
		}
		
	}
	
	boolean checkEvenOddB(int num) {
		if (num % 2 == 0) {
			System.out.println("No. is Even");
			return true;
		}	else {
			System.out.println("No. is Odd");
			return false;
		}
	}
	
	String check_even_odd(int num) {
		if (num % 2 == 0) {
//			System.out.println("No. is Even");
			return "Even Number";
		}	else {
//			System.out.println("No. is Odd");
			return "Odd Number";
		}
		
	}
}
