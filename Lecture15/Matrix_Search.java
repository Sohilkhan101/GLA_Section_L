package Lecture15;

public class Matrix_Search {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		display(arr);
		int target = 2;
		System.out.println(find(arr, target));
	}

	private static boolean find(int[][] arr, int target) {
		int row = arr.length - 1;
		int col = 0;
		while (row >= 0 && col < arr[0].length) {
			if (arr[row][col] == target) {
				return true;
			} else if (arr[row][col] > target) {
				row--;
			} else {
				col++;
			}
		}
		return false;
	}

//	private static void display(int[][] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}

}
