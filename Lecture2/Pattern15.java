package Lecture2;

public class Pattern15 {
	public static void main(String[] args) {
		int n = 5;
		int nsp = 0;
		int nst = n;
		int trow = (2 * n) - 1;

		int row = 0;
		while (row < trow) {

			// space
			for (int i = 0; i < nsp; i++) {
				System.out.print("  ");
			}

			// star
			for (int i = 0; i < nst; i++) {
				System.out.print("* ");
			}
			if (row < trow / 2) {
				nsp+=2;
				nst--;
			} else {
				nsp-=2;
				nst++;
			}
			System.out.println();
			row++;
		}
	}

}
