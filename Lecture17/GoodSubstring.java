package Lecture17;

public class GoodSubstring {
	public static void main(String[] args) {
		String s = "cbaeicde";

//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				String str = s.substring(i, j);
//				if (isgood(str)) {
//					if (str.length() > ans) {
//						ans = str.length();
//					}
//					System.out.println(str);
//				}
//			}
//		}
//		System.out.println(ans);
//	}
//
//	private static boolean isgood(String str) {
//
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				continue;
//			} else {
//				return false;
//			}
//		}
//		return true;
//	}

		int count = 0;
		int ans = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isvov(ch)) {
				count++;
				ans = Math.max(ans, count);
			}else {
				count=0;
			}
		}
		System.out.println(ans);

	}

	private static boolean isvov(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}
