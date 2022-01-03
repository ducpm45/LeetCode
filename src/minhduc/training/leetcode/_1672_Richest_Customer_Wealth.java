package minhduc.training.leetcode;

public class _1672_Richest_Customer_Wealth {

	public int maximumWealth(int[][] accounts) {
		int max = -1;
		for (int i = 0; i < accounts.length; i++) {
			int wealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				wealth += accounts[i][j];
			}
			if (wealth > max) {
				max = wealth;
			}
		}
		return max;
	}
}
