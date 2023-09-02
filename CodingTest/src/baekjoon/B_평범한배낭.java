package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_평범한배낭 {
	public static void main(String[] args) throws IOException {// 냅색 알고리즐 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] nap = new int[K+1];// 1차원
		for(int i =1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			for(int k = K;k>=w; k-- ) {
				if (nap[k-w]+v >nap[k]) {
					nap[k] = nap[k-w]+v;
				}
			}
		}
		System.out.println(nap[K]);
	}
}
