package task2;

public class PartTimeEmployee extends Employee {

	double hourlyRate;
	
	PartTimeEmployee (String n, int id, double hR){
		super(n,id);
		this.hourlyRate = hR;
	}
	
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("emp hourRate "+ hourlyRate);
	}
	
}
