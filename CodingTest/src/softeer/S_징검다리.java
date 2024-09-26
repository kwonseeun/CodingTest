package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_징검다리 {
	 public static void main(String[] args) throws IOException {
	      //(1) 시간복잡도를 생각해보자
	      //N이 3*10^3 -> n^2 알고리즘 사용할 수 있음
	      //(2) 알고리즘을 생각해보자 -> dp를 사용해야할 것 같다

	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int N = Integer.parseInt(br.readLine());
	      int[] arr = new int[N];
	      int[] dp = new int[N];
	      Arrays.fill(dp, 1);
	      
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      for(int i=0; i<N; i++) {
	        arr[i] = Integer.parseInt(st.nextToken());
	      }
	      
	      for(int i=0; i<N; i++){
	        for(int j=0; j<i; j++) {
	          if(arr[j] < arr[i]) { //다음 돌이 현재 돌보다 높을 때
	            //현재 돌을 밟았을 때와, 이전 돌을 밝고 현재 돌을 밟았을 때의 최댓값 비교
	            dp[i] = Math.max(dp[i], dp[j] + 1);
	          }
	        }
	      }

	      int result = 0;
	      for(int i=0; i<N; i++) {
	        result = Math.max(dp[i], result);
	      }
	      System.out.println(result);
	    }
}
