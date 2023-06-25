package Lecture1;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		int nst = n;
		int nsp = 0;
		int j = 0;
		while (j < n) {
			// space
			int i = 0;
			while (i < nsp) {
				System.out.print("  ");
				i++;
			}
			// star
			i = 0;
			while (i < nst) {
				System.out.print("* ");
				i++;
			}
			nst--;
			nsp+=2;
			j++;
			System.out.println();
		}

	}

}
