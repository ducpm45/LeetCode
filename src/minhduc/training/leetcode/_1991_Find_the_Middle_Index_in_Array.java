package minhduc.training.leetcode;

public class _1991_Find_the_Middle_Index_in_Array {
	public int findMiddleIndex(int[] nums) {
		int n = nums.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
		}
		int rSum = sum;
		int lSum = 0;
		for (int i = 0; i < n; i++) {
			rSum -= nums[i];
			if (rSum == lSum) {
				return i;
			}
			lSum += nums[i];
		}

		return -1;
	}
}
