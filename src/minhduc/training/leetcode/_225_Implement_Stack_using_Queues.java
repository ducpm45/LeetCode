package minhduc.training.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
	/**
	 * Your MyStack object will be instantiated and called as such:
	 * MyStack obj = new MyStack();
	 * obj.push(x);
	 * int param_2 = obj.pop();
	 * int param_3 = obj.top();
	 * boolean param_4 = obj.empty();
	 * @return 
	 * @return 
	 */
	
	private Queue<Integer> q1; 
	private Queue<Integer> q2;
	
    public MyStack() {
    	q1 = new LinkedList<>();
    	q2 = new LinkedList<>();
    }
    
    public void push(int x) {
    	q1.add(x);   
    }
    
    public int pop() {
    	int value = -1;
        while(q1.isEmpty() == false) {
        	if(q1.size() == 1) {
        		value =  q1.remove();
        	} else {
        		q2.add(q1.remove());
        	}
        }
        Queue<Integer> temp = new LinkedList<>();
        q1 = q2;
        q2 = temp;
        return value;
    }
    
    public int top() {
        Object[] arr = q1.toArray();
        
        return (int) arr[arr.length-1];
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
