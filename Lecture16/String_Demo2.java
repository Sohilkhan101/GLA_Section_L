package Lecture16;

public class String_Demo2 {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s);
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 4));
		System.out.println("------");

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}
}
