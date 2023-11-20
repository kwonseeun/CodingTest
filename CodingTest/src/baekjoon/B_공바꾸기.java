package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_공바꾸기 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;
	        StringBuilder sb = new StringBuilder();

	        st = new StringTokenizer(br.readLine());
	        int N = Integer.parseInt(st.nextToken());
	        int M = Integer.parseInt(st.nextToken());
	        int[] basket = new int[N + 1];
	        for(int i = 1; i <= N; i++) {
	            basket[i] = i;
	        }
	        for(int i = 0; i < M; i++) {
	            st = new StringTokenizer(br.readLine());
	            int I = Integer.parseInt(st.nextToken());
	            int J = Integer.parseInt(st.nextToken());

	            // 공 바꾸기
	            int tmp = basket[I];
	            basket[I] = basket[J];
	            basket[J] = tmp;
	        }
	        for(int i = 1; i <= N; i++) {
	            sb.append(basket[i]).append(" ");
	        }
	        System.out.println(sb);
	    }
}
