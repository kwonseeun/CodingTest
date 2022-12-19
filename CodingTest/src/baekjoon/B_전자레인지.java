package baekjoon;

import java.util.Scanner;

public class B_전자레인지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int A = 300; // 5분
		int B = 60; // 1분
		int C = 10; // 10초
		answer = 0;
		
		if (N % 10 != 0) {
			System.out.println(-1);
		} else {
			answer = 0;
			if (N >= A) {
				N = calculate(N, A);
			}
			System.out.print(answer+" ");
			answer = 0;
			if (N >= B) {
				N = calculate(N, B);
			}
			System.out.print(answer+" ");
			answer = 0;
			if (N >= C) {
				N = calculate(N, C);
			}
			System.out.println(answer);
		}
	}

	static int answer;

	static int calculate(int N, int value) {
		answer = N / value;
		return N%value;
	}
}
