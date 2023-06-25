package Lecture5;

public class Inverse {
	public static void main(String[] args) {
		int n = 02;
		System.out.println(n);
		System.out.println(Inverse_number(n));
	}

	private static int Inverse_number(int n) {
		// TODO Auto-generated method stub

		int ans = 0;
		int place = 1;
		while (n != 0) {
			int rem = n % 10;
			ans = ans + place * (int) (Math.pow(10, rem - 1));
			n = n / 10;
			place++;

		}

		return ans;
	}

}
