package q3;

public class B extends A{

	int a = 10;
	
	String s = "JBK";
	
	public void m2() {
		int a = 15;
		
		String s = "Kiran Sir";
		
		System.out.println(a);			//	15
		System.out.println(this.a);		//	10
		System.out.println(super.a);	//  5
		
		System.out.println(s);			// Kiran Sir
		System.out.println(this.s);		// JBK
		System.out.println(super.s); 	// TKA
	}
	
}
