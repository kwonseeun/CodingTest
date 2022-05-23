package codingDojang;

import java.util.Scanner;

public class example09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: '");
		int cnt = sc.nextInt();
		
		int sum = 0;
		int value = 0;
		
		for (int i = 0; i <= cnt; i++) {
			System.out.println("입력 수:");
			value = sc.nextInt();
			sum+= value;
		}
		System.out.println("합: "+ sum);
		System.out.println("평균: " + sum/value);		
	}
}
