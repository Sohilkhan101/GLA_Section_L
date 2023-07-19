package Lecture19;

import java.util.ArrayList;

public class DiagonalTraverse {

	public static void main(String[] args) {
		int[][] arr = { { 10, 11, 12, 13 }, { 20, 21, 22, 23 }, { 30, 31, 32, 33 }, { 40, 41, 42, 43 } };

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr[0].length; i++) {
			int col = i;
			int row = 0;
			int s = list.size();
			while (col >= 0) {
				if (i % 2 == 0) {
					list.add(arr[row][col]);
				} else {
					list.add(s, arr[row][col]);

				}
				col--;
				row++;
			}
		}
//		System.out.println(list);

		for (int i = 1; i < arr.length; i++) {
			int row = i;
			int col = arr[0].length - 1;
			int s = list.size();
			while (row < arr.length) {
				if (i % 2 != 0) {
					list.add(arr[row][col]);
				} else {
					list.add(s, arr[row][col]);

				}
				col--;
				row++;
			}
		}
		System.out.println(list);

	}

}
