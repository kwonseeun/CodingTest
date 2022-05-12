package Array_배열;

import java.util.Scanner;

public class example02 {
	public int solution(int n, int[] arr ) {
		int answer =1, max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i]>max) {
				answer++; 
				max = arr[i];
			}
		}
		return answer;
		
	}
	public static void main(String[] args) {
		example02 e = new example02();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(e.solution(n, arr));
		
	}
}

 
