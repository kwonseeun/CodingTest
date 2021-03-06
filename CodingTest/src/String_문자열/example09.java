package String_문자열;

import java.util.Scanner;

/**문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만든다.
 * 만약 "tge0a1h205er" 에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수로 만들면 1205 이다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않는다. */
public class example09 {
	public int solution(String s) {
		int answer = 0; // answer를 계속 갱신한다. 
		for (char x: s.toCharArray()) { //x는 알파벳이 됐다가 숫자가 됐다가 한다 
			if (x >= 48 && x<=57) // 48부터 57사이(아스키번호) 문자 0이 48, 문자 9가 57
				answer=answer*10+(x-48);  // 0*10+0 = 0 이므로 첫번째는 무시, 그다음은 1 
										  // 1 = 0 * 10 + 1 = 1
										  // 2 = 1 * 10 + 2 = 12
									      //    12 * 10 + 0 = 120
			  							  //    120* 10 + 5	= 1205
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		example09 e = new example09();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(e.solution(str));
	}

}
