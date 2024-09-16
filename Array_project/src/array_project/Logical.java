package array_project;

public class Logical {

	public static int maxNum(int[] marks) {
		int topper = marks[0];
		
		for (int i = 0; i<marks.length; i++) {
			if(marks[i]> topper) {
				topper = marks[i];
				//System.out.println(topper);
			}
		}
		return topper;
	}
	
	
	public static int minNum(int[] marks) {
		int lower = marks[0];
		for(int i =0; i<marks.length; i++) {
			if(marks[i]< lower) {
				lower = marks[i];
			}
		}
		return lower;
	}
}
