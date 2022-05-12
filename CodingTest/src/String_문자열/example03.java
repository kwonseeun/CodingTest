package String_문자열;

import java.util.Scanner;

public class example03 {

	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화 된다.
		String[] s = str.split("");
		for (String x : s) {
			int len = x.length(); // 각각 길이의 단어가 len 에 들어가고 
			if (len > m) { // len 이 m보다 크면 
				m = len; // m 으로 갱신이 된다 (최대값 구하는 알고리즘)
				answer = x;// 최대값이발견될 때 마다 answer 에 넣어준다 
			}
		}
		return answer;  
	}
	
	
	public static void main(String[] args) {

		example03 e = new example03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
	}

}
