package algorythm01;

import java.util.Scanner;

public class example05 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1; 
		while(lt < rt ) {
			if(Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp =s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer= String.valueOf(s);
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		example05 ex = new example05();
		Scanner sc = new Scanner(System.in);
		
		String str= sc.next();
		System.out.println(ex.solution(str));
	}

}
