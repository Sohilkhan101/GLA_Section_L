package Lecture6;

public class Functions {
	static int a = 10;

	public static void main(String[] args) {
		Functions obj = new Functions();
		int b = add(2, 3);
		System.out.println(b);
//		int a = 11;
		System.out.println(a);
		obj.sub(3, 2);
	}

	public void sub(int i, int j) {
		int a = 1;
		System.out.println(a);
		System.out.println(i - j);
	}

	public static int add(int i, int j) {
//		System.out.println(i + j);
		return i + j;
	}

}
