package codingDojang;

import java.util.Scanner;

public class example16 {

	public void solution (String input) {
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			String tmp = Character.toString(input.charAt(i));
			
			if (!result.contains(tmp)) {
				result += tmp;
			}
			
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		example16 e = new example16();
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		e.solution(input);
	}

}
