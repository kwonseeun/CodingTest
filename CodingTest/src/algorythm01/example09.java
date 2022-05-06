package algorythm01;

import java.util.Scanner;

public class example09 {
	public int solution(String s) {
		int answer = 0;
		for (char x: s.toCharArray()) {
			if (x >= 48 && x<=57) 
				answer=answer*10+(x-48); 
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		example09 e = new example09();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(e.solution(str));
	}

}
