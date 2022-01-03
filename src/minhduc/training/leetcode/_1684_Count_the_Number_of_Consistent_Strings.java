package minhduc.training.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _1684_Count_the_Number_of_Consistent_Strings {
	public int countConsistentStrings(String allowed, String[] words) {

		Set<Character> mySet = new HashSet<>();
		for (int i = 0; i < allowed.length(); i++) {
			mySet.add(allowed.charAt(i));
		}
		int count = 0;
		for (String word : words) {
			int i = 0;
			boolean check = true;
			while (i < word.length()) {
				if (!mySet.contains(word.charAt(i))) {
					check = false;
					break;
				}
				i++;
			}
			if (check) {
				count++;
			}
		}

		return count;
	}
}
