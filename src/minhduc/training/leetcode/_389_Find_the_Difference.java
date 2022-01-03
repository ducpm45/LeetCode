package minhduc.training.leetcode;

public class _389_Find_the_Difference {
    public char findTheDifference(String s, String t) {
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		int x = 0;
		for (int i = 0; i < b.length; i++) {
			x ^= (b[i] - 97);
		}
		for (int i = 0; i < a.length; i++) {
			x ^= (a[i] - 97);
		}

		return (char) (x + 97);
    }
}
