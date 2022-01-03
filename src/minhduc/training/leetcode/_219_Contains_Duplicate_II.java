package minhduc.training.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _219_Contains_Duplicate_II {
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {

			if (!myMap.containsKey(nums[i])) {
				myMap.put(nums[i], i);
			} else {
				int j = myMap.get(nums[i]);
				if (Math.abs(i - j) <= k) {
					return true;
				} else {
					myMap.put(nums[i], i);
				}
			}
		}

		return false;
	}
}
