package baekjoon;

import java.util.ArrayDeque;
import java.util.Queue;

public class B_문자열 {
	 public int solution(String s) {
	        Queue<Character> queue = new ArrayDeque<>();
	        for (char c : s.toCharArray()) queue.add(c);

	        int front = 0;
	        int back = 0;

	        while (!queue.isEmpty()) {
	            if (queue.peek() == ')') {
	                queue.poll();
	                back++;
	                if (front == 0) break;
	                front--;
	                back--;
	            } else if (queue.peek() == '(') {
	                queue.poll();
	                front++;
	            }
	        }

	        return front+back == 0 ? 1 : 0;
	 }
}
