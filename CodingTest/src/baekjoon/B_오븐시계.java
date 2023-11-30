package baekjoon;

import java.util.Scanner;

public class B_오븐시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short A = sc.nextShort();
		int B = sc.nextShort() + sc.nextShort();
		
		while ( B > 59) {
			A++;
			B -= 60;
			if(A>23) {
				A -= 24;
			}
		}
		System.out.printf("%d %d", A, B);
		
	}
}
