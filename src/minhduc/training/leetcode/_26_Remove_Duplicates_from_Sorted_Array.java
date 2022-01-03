package minhduc.training.leetcode;

import java.util.ArrayList;

import java.util.List;

public class _26_Remove_Duplicates_from_Sorted_Array {

	public int removeDuplicates(int[] nums) {
		int n = nums.length;
		if (n <= 1)
			return n;
		int val = nums[0];
		int count = 1;
		List<Integer> list = new ArrayList<>();
		list.add(nums[0]);

		for (int i = 1; i < n; i++) {
			if (nums[i] != val) {
				count++;
				val = nums[i];
				list.add(val);
			}
		}

		for (int i = 0; i < n; i++) {
			if (i < count) {
				nums[i] = list.get(i);
			} else {
				nums[i] = 0;
			}
		}

		return count;

	}
}
