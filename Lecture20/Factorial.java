package Lecture20;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n));
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		}
		int sp = fact(n - 1);
		int bp = sp * n;
		return bp;
	}

}
