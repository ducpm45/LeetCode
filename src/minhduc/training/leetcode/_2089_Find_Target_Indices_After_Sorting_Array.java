package minhduc.training.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2089_Find_Target_Indices_After_Sorting_Array {
	public List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				list.add(i);
		}

		return list;
	}
}
