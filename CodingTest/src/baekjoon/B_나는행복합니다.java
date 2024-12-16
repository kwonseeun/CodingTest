package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_나는행복합니다 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String arg = br.readLine();
	        StringTokenizer st = new StringTokenizer(arg, " ");
	        int n = Integer.parseInt(st.nextToken());
	        int m = Integer.parseInt(st.nextToken());
	        int find = Integer.parseInt(st.nextToken());

	        int x = find / m;
	        int y = find % m;
	        System.out.println(x + " " + y);

	        //입력: 6 4 14
	        //출력: 3 2

	    }
}
