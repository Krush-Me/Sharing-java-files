package sum_of_digits;

public class sumOfDigits {

	int num = 123;
	int sum = 0;
	
	public void sumDigits() {
		
		while(num > 0) {
			//System.out.println(num % 10);		// this to print separate digits
//			int digit = num % 10;
//			sum = sum + digit; 
			/* above 2 lines can be written as: */
			sum = sum + num %10;
			num = num / 10;
		}
		System.out.println(sum);
	}
	
}
