package algorythm01;

import java.util.Scanner;

/**1. 문자 찾기 
 * 한 개의 문자열을 입력받고, 특정 문자열을 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지알아내는 
 * 프로그램, 대소문자를 구분하지 않고 문자열의 길이는 100을 넘지 않는다. */
public class example01 {
	public int solution (String str, char t) {
		int answer = 0;
		// 대문자 변환 
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		//str 의 갯수 반복문 
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==t) answer++; {
				
			}
			
		}
		return answer;

	}
	
	public static void main(String[] args) {
		
		example01 e = new example01();
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(e.solution(str, c));
	}
		
}
