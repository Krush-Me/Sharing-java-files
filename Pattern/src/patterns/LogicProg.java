package patterns;

public class LogicProg {

	// square star pattern
//	* * * * * 
//	* * * * * 
//	* * * * * 
//	* * * * * 
//	* * * * *
	void logic1(int N) {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	// square star pattern

	
	// right angle triangle star pattern
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
	void logic2(int N) {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	// right angle triangle star pattern

	
	// inverted-right angle triangle star pattern
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	void logic3(int N) {
		for (int i = N; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	// inverted-right angle triangle star pattern

	
//	void logic4(int N) {
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= N; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		System.out.println("-------------");
//	}

	
	
	// Pattern
//		    *
//	      * *
//	    * * *
//	  * * * *
//	* * * * *
	// Pattern using if else
		void logic11(int N) {
			for (int i = 1; i <= N; i++) {
				for (int j = N; j >= 1; j--) {
					if (i >= j) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("-------------");
		}
		// Pattern using if else
		
	// Pattern	
	void logic10(int N) {
		for (int i = 1; i <= N; i++) {
			// Print leading spaces
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			// Print asterisks
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
		System.out.println("-------------");
	}

	// Pattern

	
	// Pattern
//   		    *
// 		      * *
//		    * * *
//		  * * * *
//		* * * * *
	void logic6(int N) {
		for(int i=1; i<=N; i++) {
			for(int j=5; j>=1; j--) {
				if(i>=j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
// Pattern

	
	// Pattern
//		* * * * *
//		  * * * *
//		    * * *
//		      * *
//			    *
	void logic14() {
		
	}
	
	// Pattern
	

	
	// Pattern
//	* * * * *
//	*		*
//	* 		*
//	* 		*
//	* * * * *
	void logic13() {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	// Pattern
	
}
