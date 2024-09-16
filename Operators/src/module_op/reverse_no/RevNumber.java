package module_op.reverse_no;

public class RevNumber {

	public static void main(String[] args) {
		
		int n = 5434;

		int rev = 0;

		int r = n % 10; // 4
		rev = (rev * 10) + r; // 0 + 4 = 4
		n = n / 10; // 543

		r = n % 10; // 3
		rev = (rev * 10) + r; // 4*10 + 3 = 43
		n = n / 10; // 54

		r = n % 10; // 4
		rev = (rev * 10) + r; // 43 * 10 + 4 = 434
		n = n / 10; // 5

		r = n % 10; // 5
		rev = (rev * 10) + r; // 434 * 10 + 5 = 4345
		n = n / 10; // 0

		System.out.println(" reverse no : " + rev);
		 
	}
}
