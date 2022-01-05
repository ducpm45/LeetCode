package minhduc.training.leetcode;

import java.util.PriorityQueue;

public class _1337_The_K_Weakest_Rows_in_a_Matrix {
	class Soldiers implements Comparable<Soldiers> {
		int index;
		int soldiers;

		Soldiers(int index, int soldiers) {
			this.index = index;
			this.soldiers = soldiers;
		}

		@Override
		public int compareTo(Soldiers o) {
			if (this.soldiers != o.soldiers) {
				return this.soldiers - o.soldiers;
			}
			return this.index - o.index;
		}

	}

	public int[] kWeakestRows(int[][] mat, int k) {
		PriorityQueue<Soldiers> queue = new PriorityQueue<>();
		for (int i = 0; i < mat.length; i++) {
			int count = 0;
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1)
					count++;
			}
			queue.add(new Soldiers(i, count));
		}

		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = queue.poll().index;
		}

		return result;
	}
}
