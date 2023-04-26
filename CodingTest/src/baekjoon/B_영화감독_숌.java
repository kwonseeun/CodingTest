package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_영화감독_숌 {
	public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;

        int n = Integer.parseInt(br.readLine());

        int cnt = 0; long ans = 1; String answer = "";
        while(cnt!=n){
            String str = String.valueOf(ans);
            if(str.contains("666")){
                cnt++;
                answer = str;
            }
            ans++;
        }
        bw.write(answer+"\n");

        bw.flush();
        bw.close();
    }

}
