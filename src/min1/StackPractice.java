package min1;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		stack.push('a');
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
	}

}
