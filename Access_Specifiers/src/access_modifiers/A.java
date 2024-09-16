package access_modifiers;

public class A {

	private int b = 10;
	public int c = 15;
	protected int d = 50;
	
//	private A(){
//		System.out.println("Constructor");
//	}
	
//	public A(){
//		System.out.println("constructor 2");
//	}
	
	protected A() {
		System.out.println("constructor 3");
	}
	
//	private void m1() {		// private is called only within class
//		System.out.println(111);
//		
//	}
//	
	
	protected void m2() {	// protected is called within package/within class
		System.out.println("method 2");
		
	}
	
}
