package q5;

public class Test {

	    public static void main(String[] args) {
	        
	    	PrimeCheck_array pca = new PrimeCheck_array();
	    	
	    	int[] numbers = {8,25,7,11,12,9,67};
	    	
	    	int[] primeNumbers =  pca.getPrimeNumbers(numbers);
	    	
	    	System.out.println("Prime Numbers: ");
	    	for (int i=0; i<primeNumbers.length; i++) {
	            System.out.print(primeNumbers[i]+ " ");
	        }

	

	    }
	
}
