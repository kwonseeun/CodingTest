package doit_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 투 포인터 이동원칙 
 * A[i] + A[j] > M : j--; 번호의 합이 m보다 크므로 큰 번호 인덱스를 내린다 
 * A[i] + A[j] < M : i++; 번호의 합이 m보다 작으므로 작은 번호 인덱스를 내린다 
 * A[i] + A[j] == M: i++; j--; count++; // 양쪽 포인터를 모두 이동시키고 카운트를 증가 
 * */
public class D_주몽의명령 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int N = Integer.parseInt(br.readLine());
		 int M = Integer.parseInt(br.readLine());
		 int[] A = new int[N];
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		 Arrays.sort(A);
		 int count = 0;
		 int i = 0; // A[0] -> Min
		 int j = N-1; //A[N-1] -> Max
		 
	}
}
