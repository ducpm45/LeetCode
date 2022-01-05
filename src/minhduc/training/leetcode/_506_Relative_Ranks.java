package minhduc.training.leetcode;

import java.util.PriorityQueue;

public class _506_Relative_Ranks {

	class Rank implements Comparable<Rank> {
		private int index;
		private int score;

		Rank() {
		}

		Rank(int index, int score) {
			this.index = index;
			this.score = score;
		}

		@Override
		public int compareTo(Rank o) {

			return o.score - this.score;
		}

	}
	public String[] findRelativeRanks(int[] score) {
		PriorityQueue<Rank> queue = new PriorityQueue<>();
		int n = score.length;
		String[] result = new String[n];

		for (int i = 0; i < n; i++) {
			queue.add(new Rank(i, score[i]));
		}
		int k = 1;
		while (!queue.isEmpty()) {
			Rank rank = queue.poll();
			if (k == 1) {
				result[rank.index] = "Gold Medal";
			} else if (k == 2) {
				result[rank.index] = "Silver Medal";
			} else if (k == 3) {
				result[rank.index] = "Bronze Medal";
			} else {
				result[rank.index] = String.valueOf(k);
			}
			k++;
		}
		return result;
	}
}
