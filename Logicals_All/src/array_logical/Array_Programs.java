package array_logical;

//import java.util.Arrays;

public class Array_Programs {

	/* Q.1 - Reverse elements of an array */
	public void reverseArray(int[] arr) { /* --- reverse array method --- */

		/* Print Given Array ----start---- */
		System.out.println("Given Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		/* Print Given Array ----end---- */

		/* Print Reverse Array ----start---- */
		System.out.println("\n\nAfter Reversing array: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		/* Print Reverse Array ----end---- */
	}

	/* Q.2 - Find max element from an array */
	public void maxElement(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("\n\nMax element in array is: " + max);
	}

	/* Q.3 - Find min element from an array */
	public void minElement(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("\nMin element in array is: " + min);
	}

	/* Q.4 - sort an array *//* (it will require 2 loops) */
	public void sortArray(int[] arr) {
		System.out.print("\nUnSorted Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("\nSorted Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

//	public void sortArray(int[] arr) {
//	Arrays.sort(arr);
//	System.out.println("\nSorted array: " + Arrays.toString(arr));
//	}

}
