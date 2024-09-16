package inheritance_project;

public class Test {

	public static void main(String[] args) {
		
		E jay = new E();
			System.out.println("E class Object jay :");
			jay.m5();
			jay.m2();
			jay.m1();
			
		C viru = new C();
			System.out.println("C class Object viru :");
			viru.m3();
			viru.m1();
			
		D gabbar = new D();
			System.out.println("D class Object gabbar :");
			gabbar.m4();
			gabbar.m1();
		
		B b1 = new B();
			System.out.println("B class Object b1 :");
			b1.m2();
			b1.m1();
			
		A a1 = new A();
			System.out.println("A class Object a1 :");
			a1.m1();
			
			
		A obj1 = new B();
		A obj2 = new C();
		A obj3 = new D();
		A obj4 = new E();
		B obj5 = new E();
		
			obj5.m1();
			
	}

}
