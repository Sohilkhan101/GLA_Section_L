package Lecture17;

public class PalindromicSubstring {
	public static void main(String[] args) {
		String s = "nitin";
		String k = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);
				if (isPalindrom(str) == true) {
					System.out.println(str);
					if (str.length() > k.length()) {
						k = str;
					}
				}
			}
		}
		System.out.println(k);
	}

	private static boolean isPalindrom(String str) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
