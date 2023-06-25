package Lecture2;

public class Pattern21 {
	public static void main(String[] args) {
		int n = 5;
		int nst1 = 1;
		int nst2 = 1;
		int nsp = (2 * n) - 3;

		int row = 0;

		while (row < n) {

			// stars
			for (int i = 0; i < nst1; i++) {
				System.out.print("* ");
			}

			// space
			for (int i = 0; i < nsp; i++) {
				System.out.print("  ");
			}

			// stars
			if (row == n - 1) {
				nst2--;
			}
			for (int i = 0; i < nst2; i++) {
				System.out.print("* ");
			}

			nst1++;
			nst2++;
			nsp -= 2;

			System.out.println();
			row++;
		}

	}

}
