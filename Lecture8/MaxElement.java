package Lecture8;

public class MaxElement {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 7, 3, 8, 2, 9 };

		// Linear Search

//		int max = Integer.MIN_VALUE;

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);

	}
}
