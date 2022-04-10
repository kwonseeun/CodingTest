package algorythm01;

import java.util.Scanner;

public class example03 {

	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화 된다.
		String[] s = str.split("");
		for (String x : s) {
			System.out.println(x);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {

		example03 e = new example03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
	}

}
