package swapping_no;

public class Swap_no {

	public static void main(String[] args) {
		
		// swapping without using 3rd variable
		int a = 5;
		int b = 9;
		
			System.out.println("Before Swap : ");
			System.out.println(a);
			System.out.println(b);
		
			a = a + b;
			b = a - b;
			a = a - b;
			
			System.out.println("After Swap using Arithmetic : ");
			System.out.println(a);
			System.out.println(b);
			
			
			
		// Swapping with using Xor ^
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
			System.out.println("After Swap using Xor : ");
			System.out.println(a);
			System.out.println(b);
			
			
		// swapping using Arithmetic Operators
			int p = 10;
			int q = 4;
			p = p * q;
			q = p / q;
			p = p / q;
			System.out.println("After Swap : ");
			System.out.println(p);
			System.out.println(q);
			
		// swapping using temp variable
			int temp;
			temp = a;
			a = b;
			b = temp;
			System.out.println("After Swap using temp : ");
			System.out.println(a);
			System.out.println(b);
			
			
	}
}
