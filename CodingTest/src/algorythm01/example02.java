package algorythm01;

import java.util.Scanner;

public class example02 {

	public String solution(String str) {
		String answer="";
		for (char x : str.toCharArray()) { // 스트링 기반 문자 배열 생성 
			if (Character.isLowerCase(x)) answer+=Character.toUpperCase(x); //x 가 소문자 ? 대문자? 참이면 answer에 대문자화 된걸 누적시킨다. 
			else Character.toLowerCase(x); // x가 대문자면 소문자로 바꿔준다
		} 
		return answer;
	}
	
	public static void main(String[] args) {

		example02 e = new example02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(e.solution(str));
	}
}
