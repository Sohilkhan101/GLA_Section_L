package Lecture18;

public class Builder_vs_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("hello");

		int start = (int) System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s.append("a");
		}
		int end = (int) System.currentTimeMillis();

		System.out.println(end - start);

		start = (int) System.currentTimeMillis();

		String s1 = "hello";
		for (int i = 0; i < 100000; i++) {

			s1 = s1 + "a";
		}
		end = (int) System.currentTimeMillis();
		System.out.println(end - start);
	}

}
