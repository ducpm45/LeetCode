package minhduc.training.leetcode;

import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {

	Stack<Integer> mainStack;
	Stack<Integer> tempStack;

	public MyQueue() {
        mainStack = new Stack<>();
        tempStack = new Stack<>();
    }

	public void push(int x) {
		mainStack.add(x);
	}

	public int pop() {
		if (tempStack.size() == 0) {
			while (mainStack.size() > 0) {
				tempStack.add(mainStack.pop());
			}
		}
		return tempStack.pop();
	}

	public int peek() {
		if (tempStack.size() == 0) {
			while (mainStack.size() > 0) {
				tempStack.add(mainStack.pop());
			}
		}
		return tempStack.peek();
	}

	public boolean empty() {
		return mainStack.isEmpty() && tempStack.isEmpty();
	}
}
