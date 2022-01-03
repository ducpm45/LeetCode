package minhduc.training.leetcode;

public class _704_Binary_Search {

	public int search(int[] nums, int target) {
//		return search(nums, target, 0, nums.length - 1);

		/*
		 * Using Loops
		 */
		int iLeft = 0;
		int iRight = nums.length - 1;

		while (iLeft <= iRight) {
			int iMid = (iLeft + iRight) / 2;
			if (nums[iMid] == target)
				return iMid;
			if (nums[iMid] > target) {
				iRight = iMid - 1;
			} else {
				iLeft = iMid + 1;
			}
		}
		return -1;
	}

	/*
	 * Using Recursion
	 */
	private int search(int[] nums, int target, int iLeft, int iRight) {
		int iMid = (iLeft + iRight) / 2;
		if (iLeft > iRight)
			return -1;
		if (nums[iMid] == target)
			return iMid;
		if (nums[iMid] > target) {
			return search(nums, target, iLeft, iMid - 1);
		} else {
			return search(nums, target, iMid + 1, iRight);
		}
	}
}
