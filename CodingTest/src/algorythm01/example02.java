package algorythm01;

import java.util.Scanner;

public class example02 {

	public String solution(String str) {
		String answer="";
		for (char x : str.toCharArray()) { // 스트링 기반 문자 배열 생성 
			if (Character.isLowerCase(x)) answer+=Character.toUpperCase(x); //x 가 소문자 ? 대문자? 참이면 answer에 대문자화 된걸 누적시킨다. 
			else answer+=Character.toLowerCase(x); // false일때, x = 대문자면 소문자로 바꿔준다
		} 
		return answer;
	}
	//대문자 65~90 , 소문자 97~122  대 - 소 = 32 소문자에서 32를 빼면 대문자가 된다 
	
	public static void main(String[] args) {

		example02 e = new example02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(e.solution(str));
	}
}
 