package Lecture14;

public class Transpose {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		display(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;	
			}
		}	
		display(arr);
	}

	private static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
