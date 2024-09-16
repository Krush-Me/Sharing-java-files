package patterns;

public class LogicProg2 {

	// Letters Pattern1
		// A
		// AB
		// ABC
		// ABCD
		// ABCDE
		void logic7(int N) {

			for (int i = 1; i <= N; i++) {
				char ch = 'A';

				for (int j = 1; j <= i; j++) {
					System.out.print(ch);
					ch++;
				}
				System.out.println();
			}
			System.out.println("-------------");
		}
		// Pattern1 Letters

		
		// Pattern2 Letters
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
		void logic8(int N) {
			char ch = 'A';
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(ch);
				}
				System.out.println();
				ch++;
			}
			System.out.println("-------------");
		}
		// Pattern2 Letters

		
		// Pattern3 Letters
//			A
//			BC
//			DEF
//			GHIJ
//			KLMNO
		void logic9(int N) {
			char ch = 'A';
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println();
			}
			System.out.println("-------------");
		}
		// Pattern3 Letters

		
		// Pattern
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
		void logic12(int N) {
			int num = 1;
			
			for(int i=1; i<=N; i++) {
				for (int j=1; j<=i; j++) {
					System.out.print(num + " ");
					num++;
				}
				System.out.println();
			}
			System.out.println("-------------");
		}
	// Pattern 
		
	
}
