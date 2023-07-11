package Lecture14;

import java.util.Scanner;

public class TwoDArray_Demo {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		System.out.println();

		for (int a[] : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

//		int[][] brr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		System.out.println(brr);

		sc.close();
	}

}

//1 2 3 4
//5 6 7 8
//9 10 11 12