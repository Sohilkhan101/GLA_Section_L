package Lecture8;

import java.util.Arrays;

public class ReversalAlgo {
	public static void main(String[] args) {

		int k = 17;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		k = k % arr.length;
		
		rotate(arr, 0, arr.length - 1);
		rotate(arr, 0, k - 1);
		rotate(arr, k, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void rotate(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
