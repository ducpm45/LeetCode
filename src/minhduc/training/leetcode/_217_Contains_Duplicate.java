package minhduc.training.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> mySet = new HashSet<>();
		for (int i : nums) {
			if (mySet.contains(i))
				return true;
			mySet.add(i);
		}
		return false;
	}
}
