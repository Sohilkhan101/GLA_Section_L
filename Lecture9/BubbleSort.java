package Lecture9;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 1 };
		for(int pass=0;pass<arr.length-1;pass++)
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int t = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = t;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
