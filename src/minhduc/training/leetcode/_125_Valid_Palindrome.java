package minhduc.training.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class _125_Valid_Palindrome {
	public boolean isPalindrome(String s) {
		List<Character> c = convertStr(s);

		int i = 0;
		int j = c.size() - 1;

		while (i <= j) {
			if (c.get(i) != c.get(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		}

		return true;
	}

	private List<Character> convertStr(String s) {
		s = s.toLowerCase();
		char[] c = s.toCharArray();

		List<Character> list = new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			if ((c[i] > 47 && c[i] < 58) || (c[i] > 96 && c[i] < 123)) {
				list.add(c[i]);
			}
		}

		return list;
	}
}
