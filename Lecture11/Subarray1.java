package Lecture11;

public class Subarray1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, -10, 4, 5 };
		int ans = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				
				int sum = 0;
				
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				
				if (sum > ans) {
					ans = sum;
				}
				
			}
		}
		System.out.println(ans);

	}

}
