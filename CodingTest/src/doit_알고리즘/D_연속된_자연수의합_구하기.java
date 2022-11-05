package doit_알고리즘;

import java.util.Scanner;

public class D_연속된_자연수의합_구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while (end_index != N) {
			if(sum == N) {
				count++; end_index++; sum+= end_index;
			}else if(sum > N) {
				sum-= start_index;
				start_index++;
			}
		}
	}
}
