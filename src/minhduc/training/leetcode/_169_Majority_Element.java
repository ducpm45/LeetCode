package minhduc.training.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _169_Majority_Element {
	public int majorityElement(int[] nums) {
		int n = nums.length;
		if (n == 1) {
			return nums[0];
		}
		Map<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!myMap.containsKey(nums[i])) {
				myMap.put(nums[i], 1);
			} else {
				myMap.put(nums[i], myMap.get(nums[i]) + 1);
				if (myMap.get(nums[i]) > n / 2) {
					return nums[i];
				}
			}
		}
		return -1;
	}
}
