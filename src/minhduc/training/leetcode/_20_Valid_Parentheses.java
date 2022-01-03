package minhduc.training.leetcode;

import java.util.Stack;

public class _20_Valid_Parentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				char top = stack.peek();
				if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
