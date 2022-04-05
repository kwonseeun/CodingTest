package algorythm01;

import java.util.Scanner;

public class example02 {

	public String solution(String str) {
		String answer="";
		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x)) answer+=Character.toUpperCase(x); // x 가 소문자면 대문자로 변한다
			else Character.toLowerCase(x); // 대문자면 소문자로 바꿔준다
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
