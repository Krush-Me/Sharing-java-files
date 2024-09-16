
public class Calculator {

	//pratiksha
	double addition(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	//Pavan
	double avg(double p1, double p2) {
		Calculator c1 = new Calculator();
		double res = c1.addition(p1, p2);
		double average = res/2;
		return average;
	}
	//Tejas
	double discount(double a, double b) {
		Calculator c1 = new Calculator();
		double r = c1.avg(a, b);
		double disc = r*15/100;
		return disc;
	}
}
