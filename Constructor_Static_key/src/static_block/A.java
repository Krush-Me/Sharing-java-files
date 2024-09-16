package static_block;

public class A {

	{
		System.out.println("normal block");
	}
	
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("2nd Normal block");
	}
	
	static {
		System.out.println("2nd static block");
	}
	
	A (){
		System.out.println("constructor is running");
	}
	
	void m1() {
		System.out.println("111");
	}
}
