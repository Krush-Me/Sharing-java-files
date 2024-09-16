package abstract_class_project;

public class Test {

	public static void main(String[] args) {
		
		
		Amazon a1 = new Amazon();
		 	
		System.out.println(a1.loginCheck("ABC", 1234));

		AmAbs a2 = new Amazon();
		System.out.println(a2.loginCheck("ABC", 1235));
		
		
		
	}

}
