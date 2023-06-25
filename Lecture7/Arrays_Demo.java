package Lecture7;

import java.util.Scanner;

public class Arrays_Demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);

		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 10;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

//		int [] brr = {2,3,4,5,6,7,8};

		int[] brr = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			brr[i] = sc.nextInt();
		}

		for (int k : brr) {
			System.out.println(k);
		}
		sc.close();
	}

}
