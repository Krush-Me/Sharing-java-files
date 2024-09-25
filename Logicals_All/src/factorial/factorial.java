package factorial;

public class factorial {
	
//	public static int factNum(int num) {
//		int fact = 1;
//		for(int i=1; i<=num; i++) {
//			fact = fact * i;
//		}
//		return fact;
//		//System.out.println("factorial of " + num + " is: "+ fact);
//	}
	
	
	
	/*	 using recursion (calling self method)	*/
	public static int fact1(int num) {
		if(num == 0 || num < 0) {
			return 1;
		} else {
			return num * fact1(num - 1);
		}
	}
	
	
}
