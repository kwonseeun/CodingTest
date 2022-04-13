package algorythm01;

import java.util.ArrayList;
import java.util.Scanner;

public class example04 {

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		return answer;
	}
	
	public static void main(String[] args) {
		example04 ex = new example04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		for (String x : ex.solution(n, str)) {
			System.out.println(x);
		}
		
	}

}
