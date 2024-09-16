package length_of_String;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		StringLength stln = new StringLength();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
			String str = sc.nextLine();

//		String str = "aBsdh zbhs";

		int count = stln.countS(str);

		System.out.println(count);
	}

}
