package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_좋은단어 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int count = Integer.parseInt(br.readLine());

	    int ans = 0;
	    for (int i = 0; i < count; i++) {
	      Stack<Character> stack = new Stack<>();
	      String s = br.readLine();
	      for (int j = 0; j < s.length(); j++) {
	        char val = s.charAt(j);
	        if (stack.empty()) {
	          stack.push(val);
	        } else {
	          if (stack.peek() == val) {
	            stack.pop();
	          } else {
	            stack.push(val);
	          }
	        }
	      }

	      if (stack.empty()) {
	        ans++;
	      }
	    }

	    System.out.println(ans);

	  }
}
