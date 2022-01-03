package minhduc.training.leetcode;

public class _724_Find_Pivot_Index {
	public int pivotIndex(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int rightSum = sum;
		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			rightSum -= nums[i];
			if (rightSum == leftSum) {
				return i;
			}
			leftSum += nums[i];
		}
		return -1;
	}
}
