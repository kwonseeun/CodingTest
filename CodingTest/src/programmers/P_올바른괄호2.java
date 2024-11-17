package programmers;

import java.util.Stack;

public class P_올바른괄호2 {
	 boolean solution(String s) {
	        Stack<Character> stack = new Stack<>();
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '(') {
	                stack.push(s.charAt(i));
	            }
	            else {
	                if (!stack.empty() && stack.peek() == '(') {
	                    stack.pop();
	                }
	                else {
	                    return false;
	                }
	            }
	        }
	        return stack.empty() ? true : false;
	    }
}
