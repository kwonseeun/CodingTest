package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P_01타일 {
	public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        final int mod = 15746;
        long [] dp = new long[n+1];

        if(n==1){
            bw.write(1+"\n");
            bw.flush();
            bw.close();
            return;
        }

        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2])%mod;
        }

        bw.write((dp[n])%mod+"\n");


        bw.flush();
        bw.close();
    }
}
