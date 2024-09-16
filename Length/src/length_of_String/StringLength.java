package length_of_String;

public class StringLength {
	
	int countS(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			count++;
		}
		return count;
	}
	
}
