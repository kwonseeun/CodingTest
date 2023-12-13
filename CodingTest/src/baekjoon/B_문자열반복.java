package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_문자열반복 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testCase;i++) {
			String test[] = br.readLine().split(" ");
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<test[1].length();j++) { //반복할 단어
				for(int q=0;q<Integer.parseInt(test[0]);q++) { //반복할 횟수
					sb.append(test[1].charAt(j));
					// System.out.println(test[1].charAt(j));
				}
			}
			System.out.println(sb);
		}
	}
}
