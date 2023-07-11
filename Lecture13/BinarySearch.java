package Lecture13;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 9, 16, 30, 43, 92 };
		int target = 9;
		System.out.println(search(arr, target));
	}

	private static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			
		}
		
		return -1;
	}

}
