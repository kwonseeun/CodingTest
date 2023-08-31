package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_후위표기식 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		Stack<Double>s = new Stack<Double>();
		String str = br.readLine();
		for(int i = 0; i< N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		double ans = 0; 
		for(char c : str.toCharArray()) {
			switch(c) {
			case '+':
				s.add(s.pop()+s.pop());
				break;
			case '-':
				double a = s.pop();
				s.add(s.pop()-a);
				break;
			case '*':
				s.add(s.pop() * s.pop());
				break;
			case '/':
				double b  = s.pop();
				s.add(s.pop()/b);
				break;
			default : 
				s.add(arr[c-'A']*1.0);
			}
		}
		System.out.printf("%.2f",s.pop());
		
	}
}
