package minhduc.training.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_of_Recent_Calls {
	Queue<Integer> myQueue;
    public RecentCounter() {
        myQueue = new LinkedList<>();
    }
    
    public int ping(int t) {
        myQueue.offer(t);
        while(myQueue.peek()<(t-3000)) {
            myQueue.poll();
        }
        return myQueue.size();
    }
}
