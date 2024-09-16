package positive_negative;

public class Positive_Negative {

//	public boolean checkPositiveNegative(int num) {
//		if (num > 0) {
//			return true;
//		}	else {
//			return false;
//		}
//		
//	}
	

//	public int checkPositiveNegative(int num) {
//		if (num == 0) {
//			return num;
//		} else if(num > 0) {
//			return num;
//		} 
//		return num;
//	}
	
	public String checkPositiveNegative(int num) {
		if (num == 0) {
			return "Neutral no";
		} else if (num > 0) {
			return "Positive No";
		} else {
			return "Negative no";
		}
	}
}
