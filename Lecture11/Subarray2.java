package Lecture11;

public class Subarray2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, -10, 4, 5 };
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum > ans) {
					ans = sum;
				}
			}
		}
		System.out.println(ans);

	}

}
