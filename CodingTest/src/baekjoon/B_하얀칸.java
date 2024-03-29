package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_하얀칸 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String line = br.readLine();
            for (int j = i % 2; j < 8; j += 2) {
                if (line.charAt(j) == 'F') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
