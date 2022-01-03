package minhduc.training.leetcode;

public class _1945_Sum_of_Digits_of_String_After_Convert {
	public int getLucky(String s, int k) {

		long result = 0;
		char[] c = s.toCharArray();
		for (char i : c) {
			int n = i - 'a' + 1;
			result += n % 10 + n / 10;
		}

		while (result > 9 && k > 1) {
			long temp = result;
			result = 0;
			while (temp > 0) {
				result += temp % 10;
				temp = temp / 10;
			}

			k--;
		}

		return (int) result;
	}
}
