package String_문자열;

import java.util.Scanner;

public class example07 {
	public String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		example07 ex = new example07();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(ex.solution(str));
	} 
}
