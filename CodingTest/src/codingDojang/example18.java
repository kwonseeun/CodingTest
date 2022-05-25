package codingDojang;

import java.util.Scanner;

public class example18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				sb.append("O");
			}
			for (int j = 0; j < i; j++) {
				sb.append("X");
			}
			System.out.println(sb.toString());
			System.out.println();
		}
	}

}
