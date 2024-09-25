package Fibonacci_Series;

public class Fibonacci {

	public void fibonacci() {
		int n = 9;
		int n1= 0, n2= 1, n3;
		for(int i=1; i<=n; i++) {  //1,2
			System.out.println(n1);	 //  0, 1, 1,
			n3 = n1 + n2;		// 1, 2, 2, 3
			n1 = n2;			// 1, 1, 1, 
			n2 = n3;			// 1, 1, 2 
		}
	}
	
	
	
	
}
