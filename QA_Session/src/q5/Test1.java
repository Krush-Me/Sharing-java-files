package q5;

public class Test1 {
	

	    // New method to check if a number is prime
	    public boolean checkPrime(int num) {
	        int count = 0;

	        // Loop from 1 to num and count the divisors
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                count++;
	            }
	        }

	        // If the number has exactly two divisors (1 and itself), it's prime
	        if (count == 2) {
	            //System.out.println(num);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    // Method to return an array of prime numbers from a given array
	    public int[] getPrimeNumbers(int[] marks) {
	        int primeCount = 0;  // To count how many prime numbers we have

	        // First pass: Count the number of primes
	        for (int i = 0; i < marks.length; i++) {
	            if (checkPrime(marks[i])) {
	                primeCount++;  // Increment the count of prime numbers
	            }
	        }

	        // Create an array of the correct size to hold the prime numbers
	        int[] primeNumbers = new int[primeCount];
	        int index = 0;  // To keep track of where to store primes in the array

	        // Second pass: Collect the prime numbers
	        for (int i = 0; i < marks.length; i++) {
	            if (checkPrime(marks[i])) {
	                primeNumbers[index] = marks[i];
	                index++;
	            }
	        }

	        return primeNumbers;
	    }

	    

		public static void main(String[] args) {
	        // Example input array
	        Test1 obj = new Test1();
	        int[] inputArray = {12, 5, 8, 11, 3, 18, 7};

	        // Get the array of prime numbers
	        int[] primeNumbers = obj.getPrimeNumbers(inputArray);

	       
	        // Print the prime numbers
	        System.out.print("Prime numbers: ");
	        for(int i=0; i<primeNumbers.length; i++) {
	        	System.out.println(primeNumbers[i]);
	        }
	    }
	

}
