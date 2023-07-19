package Lecture18;

public class Stringbuilder {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("hello");
		
//		System.out.println(sb.capacity());
//		System.out.println(sb.length());
//		
//		sb.append("hello");
//		System.out.println(sb);
//
//		sb.append("bye");
//		System.out.println(sb);
//
//		sb.append("abc");
//		
//		System.out.println(sb.capacity());
//		System.out.println(sb.length());
		
//		System.out.println(sb);
//		
//		sb.delete(1, 2);
//		System.out.println(sb);
//		
//		sb.replace(1, 3, "Hello");
//		System.out.println(sb);
//
//		System.out.println(sb.reverse());
		
		// Builder to String
		String s = sb.toString();
		System.out.println(s);
		
		// String to Builder
		String s1 = "bye";
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println(sb1);
	}

}
