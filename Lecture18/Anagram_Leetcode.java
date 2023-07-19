package Lecture18;

import java.util.Arrays;

public class Anagram_Leetcode {
	public static void main(String[] args) {
		String s = "ABC$anagram";
		String t = "ABC$#nagaram";

		int[] freq1 = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq1[ch] = freq1[ch] + 1;
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freq1[ch] = freq1[ch] - 1;
		}
		System.out.println(Arrays.toString(freq1));

		boolean flag = false;

		for (int i = 0; i < freq1.length; i++) {
			if (freq1[i] != 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Not Anagram");
		} else {
			System.out.println("Anagram");

		}

	}

}
