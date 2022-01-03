package minhduc.training.leetcode;

public class _58_Length_of_Last_Word {

	public int lengthOfLastWord(String s) {

		int i = s.length() - 1;
		int count = 0;

		while (i >= 0 && s.charAt(i) == ' ') {
			if (count == 0) {
				i--;
			} else {
				break;
			}
		}
		while (i >= 0 && s.charAt(i) != ' ') {
			i--;
			count++;
		}

		return count;
	}
}
