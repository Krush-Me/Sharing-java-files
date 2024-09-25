package separate_Digits;

public class Separate_Digits {

	int num = 12301;
	public void separateDigits() {
		while(num != 0) {
			System.out.println(num % 10);
			num /= 10;
		}
	}

}
