package Lecture19;

import java.util.*;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			int item = sc.nextInt();
//			list.add(item);
//		}
//		System.out.println(list);
//		
//		for (int i = 0; i <list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		// ArrayList of ArrayList
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
		System.out.println(list1);

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);

		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(8);

		System.out.println(l1);
		System.out.println(l2);
		list1.add(l1);
		list1.add(l2);
		System.out.println(list1);

		// For Loop
		for (int i = 0; i < list1.size(); i++) {
			ArrayList<Integer> a1 = list1.get(i);
			for (int j = 0; j < a1.size(); j++) {
				System.out.println(a1.get(j));
			}
		}

		// For Each Loop
		for (ArrayList<Integer> m : list1) {
			for (int k : m) {
				System.out.println(k);
			}
		}

	}

}
