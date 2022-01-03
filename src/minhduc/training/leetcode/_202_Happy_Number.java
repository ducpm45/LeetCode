package minhduc.training.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {
    public boolean isHappy(int n) {

		Set<Integer> mySet = new HashSet<>();

		while (n > 1 && !mySet.contains(n)) {
			mySet.add(n);
			n = currSum(n);
    	}

		return n == 1;
    }

	private int currSum(int n) {
		int currSum = 0;
		while (n > 0) {
			int a = n % 10;
			currSum += a * a;
			a = a / 10;
    	}

		return currSum;
    }
}
