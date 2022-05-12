package String_문자열;

import java.util.Scanner;

public class example06 {
	public String solution(String str) {
		String answer="";
		for (int i = 0; i < str.length(); i++) {
			 System.out.println(str.charAt(i) + "" + i + "" +str.indexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		}
		return answer;  
	}
	public static void main(String[] args) {
		example06 ex = new example06();
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); 
		System.out.println(ex.solution(str));
	}

}
