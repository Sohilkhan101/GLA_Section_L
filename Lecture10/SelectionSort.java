package Lecture10;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 1, 8 };

		for (int i = 0; i < arr.length; i++) {
			int key = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[key]) {
					key = j;
				}
			}
			int t = arr[i];
			arr[i] = arr[key];
			arr[key] = t;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
