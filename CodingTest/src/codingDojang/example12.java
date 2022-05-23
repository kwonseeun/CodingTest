package codingDojang;

import java.util.Scanner;

public class example12 {

	/**입력 받은 문자열에서 특정 문자가 몇 개 존재하는지 찾기 */
	public static int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c ) answer++;
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요: ");
		String str =  sc.next();
		System.out.println("중복 개수를 찾고싶은 단어를 입력하세요: ");
		char c = sc.next().charAt(0);
		
		System.out.println(solution(str, c));
	}
}
