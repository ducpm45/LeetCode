package minhduc.training.leetcode;

public class _70_Climbing_Stairs {

	int[] arr = new int[46];

	public int climbStairs(int n) {
		if (arr[n] != 0)
			return arr[n];
		if (n == 1)
			arr[1] = 1;
		if (n == 2)
			arr[2] = 2;
		if (n > 2)
			arr[n] = climbStairs(n - 1) + climbStairs(n - 2);

		return arr[n];
	}
}
