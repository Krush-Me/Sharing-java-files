package Bonus;

public class Salary {
	
	public Salary(){
		System.out.println("this is Non Para Constructor");
	}
	
	public int check_bonus(int exp) {
		if (exp >= 10) {
			System.out.println("Bonus 10000");
			return exp;
		}	else if (exp >= 5) {
			System.out.println("Bonus 5000");
			return exp;
		}	else if(exp == 0){
			System.out.println("No Bonus");
			return exp;
		}	else {
			System.out.println("Experiance can't be negative");
			return exp;
		}
		
		
	}

}
