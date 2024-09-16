package pattern;

public class LogicalProg {
	
	
	void logic1(int N) {
		for (int i=0; i<N; i++) {
			
			for(int j=0; j<N; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

	void logic2(int N) {
		System.out.println();
		
		for (int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	void logic3(int N) {
		System.out.println();
		
		for (int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
	
	
	void logic4(int N) {
		System.out.println();
		
		for (int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	void logic5(int N) {
		System.out.println();
		
		for(int i=1; i<=N; i++) {
			for (int j=1; j<=N-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
//	void logic6(int N) {
//		for (int i=1; i<N; i++) {
//			for (int j=1; j<N; j++) {
//				System.out.println("A");
//				A++;
//			}
//			System.out.println();
//		}
//	}
	
	
	void logic11(int N) {
		for (int i = 1; i <= N; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	void logic12() {
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}
	
	void logic13() {
		for (int i=5; i>=1; i--) {
			for (int j=5; j>=1; j--) {
				if (i >= j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	
	void logic14() {
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=1; j--) {
				if (i >= j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	
	void logic15() {
		for (int i=5; i>=1; i--) {
			for (int j=5; j>=1; j--) {
				if (i >= j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
