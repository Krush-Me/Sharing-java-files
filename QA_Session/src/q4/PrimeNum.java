package q4;

/* 	WAP to check Prime Number	*/

public class PrimeNum {

	/* 1st scenario - simple */
//	public void checkPrime(int num) {
//		int count = 0;
//		
//		for(int i=1; i<=num; i++) {
//			if(num %i == 0) {
//				count++;
//			}
//		}
//		if(count == 2) {
//			System.out.println(num + ": Prime");
//		} else {
//			System.out.println(num + ": not Prime");
//		}
//	}

	
	/* 2nd scenario - return */
//	PrimeNum(int num) {			//we can add constructor also its not compulsory
//		this.checkPrime(num);
//	}

//	public boolean checkPrime(int num) {
//		int count = 0;
//
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println(num + ": Prime");
//			return true;
//		} else {
//			System.out.println(num + ": not Prime");
//			return false;
//		}
//	}

	
	/* 3rd scenario - if count is 0 */
//	public boolean checkPrime(int num) {
//		int count = 0;
//	
//	for(int i=2; i<num; i++) {
//		if(num %i == 0) {
//			count++;
//		}
//	}
//	if (count == 0) {
//		System.out.println(num + ": Prime");
//		return true;
//	} else {
//		System.out.println(num + ": not Prime");
//		return false;
//	}
//	}
	
	
	/* 4th scenario - using flag */ 
//	public void checkPrime(int num) {
//		int count = 0;
//		boolean flag = true;
//		
//		for(int i=2; i<num; i++) {		/* when using flag i=2, we can only have two boolean values true or false */
//			if(num %i == 0) {
//				flag = false;
//				break;
//			}
//		}
//		if (flag) {
//			System.out.println(num + ": Prime");
//		} else {
//			System.out.println(num + ": not Prime");
//		}
//	}
	
	
	/*--- 5th scenario - display all prime from given range */
	public void PrimeCheck(int num1) {
		int count = 0;
		
		for(int i=1; i<=num1; i++) {
			if(num1 %i == 0) {
				count++;
			}
		}
		if(count == 2) {
			//System.out.print(num1 + " " );
			System.out.printf("| %-2s |%n", num1);
		}
	}
	
	public void displayPrime(int start, int end) {
		System.out.println("Prime numbers from "+ start + " to "+ end + " are: ");
		for(int i=start; i<=end; i++) {
			PrimeCheck(i);
		}
	}
	/*--- 5th scenario - display all prime from given range */
	
	
	/*		*/
	
}
