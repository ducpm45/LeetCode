package minhduc.training.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _1046_Last_Stone_Weight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});

		for (int weight : stones) {
			queue.add(weight);
		}

		while (queue.size() > 1) {
			int y = queue.poll();
			int x = queue.poll();
			if (y != x) {
				int newWeight = y - x;
				queue.add(newWeight);
			}
		}
		if (queue.isEmpty())
			return 0;

		return queue.poll();
	}

}
