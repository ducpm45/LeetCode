package minhduc.training.leetcode;

public class _27_Remove_Element {

	public int removeElement(int[] nums, int val) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}

}
