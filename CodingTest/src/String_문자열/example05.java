package String_문자열;

import java.util.Scanner;

public class example05 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1; // s의 마지막 문자를 rt가 맨끝 문자를 가르킨다 
		while(lt < rt ) { 
			if(Character.isAlphabetic(s[lt])) lt++; //알파벳이 아닌지 아닌지 판별 , 아닐때 증가 
			else if(!Character.isAlphabetic(s[rt])) rt--; // rt가 알파벳이 아닐때 감소 
			else {
				char tmp =s[lt]; 
				s[lt]=s[rt]; 
				s[rt]=tmp;
				lt++; 
				rt--;
			}
		}
		answer= String.valueOf(s); // answer배열 string으로 전환 
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		example05 ex = new example05();
		Scanner sc = new Scanner(System.in);
		
		String str= sc.next();
		System.out.println(ex.solution(str));
	}

}
