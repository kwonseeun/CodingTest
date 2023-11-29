package baekjoon;

import java.util.Scanner;

public class B_N찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num = 1;
		
		for(int i=0; i<input; i++) {
			System.out.println(num++);
		}
	}
}
