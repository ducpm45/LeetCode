package minhduc.training.leetcode;

public class _1394_Find_Lucky_Integer_in_an_Array {
	public int findLucky(int[] arr) {
		int[] a = new int[501];
		for (int i = 0; i < arr.length; i++) {
			a[arr[i]] += 1;
		}
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == i && a[i] > max) {
				max = a[i];
			}
		}
		if (max == 0)
			return -1;
		return max;
	}
}
