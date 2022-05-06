package algorythm01;

import java.util.Scanner;

/**문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만든다.
 * 만약 "tge0a1h205er" 에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수로 만들면 1205 이다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않는다. */
public class example09 {
	public int solution(String s) {
		int answer = 0;
		for (char x: s.toCharArray()) {
			if (x >= 48 && x<=57) 
				answer=answer*10+(x-48); 
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
