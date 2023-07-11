package Lecture14;

public class WavePrint {
	public static void main(String[] args) {
		int[][] arr = { { 10, 11, 12, 13 }, { 20, 21, 22, 23 }, { 30, 31, 32, 33 }, { 40, 41, 42, 43 } };

		for (int col = 0; col < arr[0].length; col++) {

			if (col % 2 == 0)
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][col] + " ");
				}
			else {
				for (int j = arr.length - 1; j >= 0; j--) {
					System.out.print(arr[j][col] + " ");
				}
			}
		}

	}

}
