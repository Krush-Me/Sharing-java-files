package com.tka.sep12;

public class String_project {

	public static void main(String[] args) {

//		String s = new String("Hello");
//		
//		System.out.println(s);		// Heap Memory
//		
//		System.out.println(s.intern());		// SCP
//		
//		System.out.println(s == s.intern());	// checking memory addr(s) == memory addr(s.intern())
//		
//		System.out.println(s.equals(s.intern()));	// checking value in s == s.intern() 

		
//		/* --------- StringBuffer & StringBUilder starts --------- */
//			/* ---- StringBuffer  ---- */
//		StringBuffer sb1 = new StringBuffer("INSTAGRAM");
//		System.out.println(sb1.hashCode());
//		System.out.println(sb1);
//
//		sb1.append("Facebook");
//		System.out.println(sb1);
//		System.out.println(sb1.hashCode());
//			/* ---- StringBuffer  ---- */
		
//		StringBuilder sb2 = new StringBuilder("INSTAGRAM");
//
//		System.out.println(sb1);
//		System.out.println(sb2);
		/* --------- StringBuffer & StringBUilder end --------- */

		
		String s = "INSTAGRAM";
		System.out.println(s);
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		

		/* --------- normal method to convert string into char array start ---------*/
//		String s = "INSTAGRAM";
//		System.out.println(s);
//		char[] arraych = new char[s.length()];
//		for(int i=0; i<s.length(); i++) {
//			arraych[i] = s.charAt(i);
//			System.out.println(arraych[i]);
//		}
		/* --------- normal method to convert string into char array end ---------*/

		
		
	}

}
