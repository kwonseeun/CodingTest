package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_가구가구 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int num = Integer.parseInt(br.readLine());
	        int[][] usages = new int[num][2];
	        for (int i = 0; i < num; i++) {
	            usages[i] = Arrays.stream(br.readLine().split(" "))
	                .mapToInt(Integer::parseInt)
	                .toArray();
	        }

	        Arrays.sort(usages, (o1, o2) -> o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0]);

	        int answer = 0;
	        int endTime = 0;
	        for (int i = 0; i < usages.length; i++) {
	            if (usages[i][0] >= endTime) {
	                answer++;
	                endTime = usages[i][1];
	            }
	        }

	        System.out.println(answer);
	    }
}
