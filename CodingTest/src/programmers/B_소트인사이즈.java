package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_소트인사이즈 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        char[] N = br.readLine().toCharArray();

	        Arrays.sort(N); // 오름차순 정렬

	        StringBuilder sb = new StringBuilder();
	        for (int i = N.length - 1; i >= 0; i--) { // 내림차순 정렬로 바꿔주는 식
	            sb.append(N[i]);
	        }
	        System.out.println(sb.toString());
	    }
}
