package Lecture8;

public class LastIndex {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 7, 3, 8, 2, 9 };
		int target = 2;

		int lastIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				lastIndex = i;
			}
		}

		System.out.println(lastIndex);

	}

}
