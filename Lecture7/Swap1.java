package Lecture7;

public class Swap1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int[] brr = { 100, 200, 300, 400 };
		int a = arr[0];
		int b = brr[0];
		System.out.println(arr[0] + " " + brr[0]);
		swap(a, b);
//		swap(arr[0], brr[0]);
		System.out.println(arr[0] + " " + brr[0]);
	}

	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;
	}

}
