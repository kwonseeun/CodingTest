package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_LCS {
	public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;

        String str1 = br.readLine();
        String str2 = br.readLine();
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];

        int max_length = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    // 같다면
                     dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    // 같지 않다면
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                max_length = Math.max(dp[i][j], max_length);
            }
        }

        bw.write(max_length+"\n");
        bw.flush();
        bw.close();
    }
}
