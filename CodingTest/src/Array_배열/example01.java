package Array_배열;

import java.util.ArrayList;
import java.util.Scanner;

/**N(1<=N=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요 
 * (첫번째 수는 무조건 출력한다) 
 * 첫 줄게 자연수 N이 주어지고, 그 다음줄에 N개의 정수가 입력된다. */
public class example01 {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		
		for (int i = 1; i < n ; i++) {
			if (arr[i]>arr[i-1])answer.add(arr[i]);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		example01 e = new example01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : e.solution(n, arr)) {
			System.out.println(x + "");
		}
	}

}
