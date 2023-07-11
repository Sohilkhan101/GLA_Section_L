package Lecture13;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 56;
		System.out.println(squareroot(n));

	}

	private static int squareroot(int n) {

		int start = 1;
		int end = n;
		int ans = 0;

		while (start <= end) {
			
			int mid = (start + end) / 2;
			
			int square = mid * mid;
			
			if (square <= n) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			
		}
		return ans;
	}

}
