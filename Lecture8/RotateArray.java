package Lecture8;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 13;
//		k = k % arr.length;

		for (int i = 0; i < k; i++) {

			int lastElement = arr[arr.length - 1];

			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}

			arr[0] = lastElement;
			System.out.println(Arrays.toString(arr));
		}

	}

}
