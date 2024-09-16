package leap_year;

public class Leap_Year {
	
//	boolean checkLeapYear (int year) {
//		if ((year % 4 == 0)	|| ((year % 100 == 0) && (year % 400 == 0))) {
//			return true;
//		}	else {
//			return false;
//		}
//	}
	
//	boolean checkLeapYear (int year){
//		if (year % 4 == 0) {
//			if ((year % 100 == 0) || (year % 400 == 0)) {
//				return true;
//			}
//		} 
//		return false;
//	}
	
	boolean checkLeapYear (int year){
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			}	else {
				return false;
			}
			}
		
		if (year % 4 == 0) {
			return true;
		} 
		 
		return false;
	}
	
}


