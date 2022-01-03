package minhduc.training.leetcode;

import java.util.Stack;

public class _155_Min_Stack {
	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(val);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
	
	private class ListNode{
		int value;
		int min;
		ListNode(int value){
			this.value = value;
		}
	}
	
	Stack<ListNode> stack;;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
    	ListNode newNode = new ListNode(val);
    	if(stack.isEmpty()) {
    		newNode.min = newNode.value;
    	} else {
    		newNode.min = Math.min(newNode.value, stack.peek().min);
    	}
    	stack.add(newNode);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}
