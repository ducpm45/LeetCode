package minhduc.training.leetcode;

import java.util.PriorityQueue;

public class _703_Kth_Largest_Element_in_a_Stream {

	private PriorityQueue<Integer> queue = new PriorityQueue<>();

	private int k;

	public _703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
		this.k = k;
		for (int num : nums) {
			queue.add(num);
       }
    }

	public int add(int val) {
		queue.add(val);
		while (queue.size() > k) {
			queue.remove();
		}

		return queue.peek();
	}
}
