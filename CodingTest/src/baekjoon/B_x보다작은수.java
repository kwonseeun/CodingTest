package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_x보다작은수 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;
	        StringBuilder sb = new StringBuilder();

	        st = new StringTokenizer(br.readLine());
	        int N = Integer.parseInt(st.nextToken());
	        int X = Integer.parseInt(st.nextToken());

	        st = new StringTokenizer(br.readLine());
	        for(int i = 0; i < N; i++) {
	            int a = Integer.parseInt(st.nextToken());
	            if(a < X) {
	                sb.append(a).append(" ");
	            }
	        }
	        System.out.println(sb);
	    }
}
