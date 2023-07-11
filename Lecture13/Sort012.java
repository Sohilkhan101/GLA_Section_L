package Lecture13;

public class Sort012 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 1, 2, 0, 1, 2, };
		sort(arr);
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	private static void sort(int[] arr) {
		int st = 0;
		int mid = 0;
		int end = arr.length - 1;
		while (mid <= end) {
			if (arr[mid] == 0) {
				swap(arr, st, mid);
				mid++;
				st++;
			} else if (arr[mid] == 2) {
				swap(arr, mid, end);
				end--;
			} else {
				mid++;
			}

		}

	}

	private static void swap(int[] arr, int a, int b) {
		int t = arr[b];
		arr[b] = arr[a];
		arr[a] = t;
	}

}
