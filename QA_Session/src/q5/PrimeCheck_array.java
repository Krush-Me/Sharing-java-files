package q5;

/*	WAP to check prime numbers from given array and return new array of prime numbers	*/

public class PrimeCheck_array {

	public boolean checkPrime(int num) {
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(num %i == 0) {
				count++;
			}
		}
		if(count == 2) {
			//System.out.println(num + "prime");
			return true;
		} else {
			//System.out.println("not prime");
			return false;
		}
	}
	
	public int[] getPrimeNumbers(int[] numbers) {
		int primeCount = 0;
		
		for(int i=0; i<numbers.length; i++) {
			if(checkPrime(numbers[i])) {
				primeCount++;
			}
		}
		
		int[] primeNumbers = new int[primeCount];
		
		int index = 0;
		for(int i=0; i<numbers.length; i++) {
			if(checkPrime(numbers[i])) {
				primeNumbers[index] = numbers[i];
				index++;
			}
		}
		return primeNumbers;
	}
	
}
