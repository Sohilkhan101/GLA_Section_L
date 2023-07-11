package Lecture12;

public class RainWater {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(WaterStored(arr));
	}

	private static int WaterStored(int[] arr) {

		// left max Array
		int[] left = new int[arr.length];
		left[0] = arr[0];

		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		display(left);

		// right max Array
		int[] right = new int[arr.length];
		right[right.length - 1] = arr[arr.length - 1];

		for (int i = right.length - 2; i >= 0; i--) {
			right[i] = Math.max(arr[i], right[i + 1]);
		}
		display(right);

		
		//water stored 
		int water = 0;

		for (int i = 0; i < arr.length; i++) {
			water += Math.min(left[i], right[i]) - arr[i];
		}
		return water;
	}

	private static void display(int[] arr) {
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();

	}

}
