package String_문자열;

import java.util.Scanner;

/**앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 한다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES" 아니면 "NO"를 출력하는 프로그램을 작성하시오 
 * 단, 회문을 검사할 떄 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않는다.
 * 알파멧 이외의 문자들은 무시한다. */

public class example08 {

	public String solution(String s) {
		String answer ="NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", ""); // 정규식을 쓰기위해 replaceAll을 사용한다. ^는 부정이다. 대문자가 아니면 "" 공백으로 
		String tmp = new StringBuilder(s).reverse().toString(); 
		
		if (s.equals(tmp)) answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		example08 e = new example08();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(e.solution(str));
	}
}
