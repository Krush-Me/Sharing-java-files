package pojo_class;

public class Test {

	public static void main(String[] args) {
		
		// object 1
		employee e1 = new employee(100,"Jay",20000,"Dev",987456123);	
		System.out.println(e1);
		
		// object 2
		employee e2 = new employee();
		System.out.println(e2);
		  e2.setEid(101);
		  e2.setEname("Viru");
		 System.out.println("updated " + e2);
		
		
	}

}
