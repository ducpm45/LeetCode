package minhduc.training.leetcode;

public class _1221_Split_a_String_in_Balanced_Strings {
	public int balancedStringSplit(String s) {
		int count = 0;
		int nR = 0;
		int nL = 0;
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (c == 'R') {
				nR++;
			} else if (c == 'L') {
				nL++;
			}
			if (nR == nL) {
				count++;
			}

		}

		return count;
	}
}
