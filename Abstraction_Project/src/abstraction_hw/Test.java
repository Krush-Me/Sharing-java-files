package abstraction_hw;

public class Test {

	public static void main(String[] args) {
		
//		A a1 = new A();
//			a1.m1();
//		
//			a1.hashCode();
			
		
		B b1 = new B();
			b1.equals(b1);
			System.out.println(b1.equals(args));
			System.out.println(b1.getClass());
			System.out.println(b1.toString());
			
	}

}
