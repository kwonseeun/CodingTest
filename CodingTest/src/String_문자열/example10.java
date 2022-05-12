package String_문자열;

import java.util.Scanner;

/**한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 t와 떨어진 최소거리를 
 * 출력하는 프로그램을 작성하세요. 
 * 
 * 첫 번째 줄에 문자열 s와 문자t가 주어진다. 문자열과 문자는 소문자로만 주어진다.
 * 문자열의 길이는 100을 넘지 않는다. 
 * */
public class example10 {
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				p=0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			} // 왼쪽으로부터 떨어진 거리가 나온다. 
		}
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		example10 e = new example10();
		Scanner sc = new Scanner(System.in);
	}

}
