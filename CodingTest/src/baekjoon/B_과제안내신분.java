package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_과제안내신분 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] report = new boolean[31];

        for (int i = 0; i < 28; i++) {
            report[Integer.parseInt(br.readLine())] = true;
        }
        for(int i = 1; i <= 30; i++) {
            if(!report[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
