package minhduc.training.leetcode;

import java.util.Arrays;

public class _414_Third_Maximum_Number {
	public int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int max = nums[nums.length - 1];
		int count = 1;
		int i = nums.length - 2;

		while (i >= 0 && count < 3) {
			if (nums[i] < max) {
				count++;
				max = nums[i];
				if (count == 3) {
					return nums[i];
				}
			}
			i--;
		}

		return nums[nums.length - 1];
	}

}
