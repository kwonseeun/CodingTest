package programmers;

public class P_겹치는선분의_길이 {
	 public int solution(int[][] lines) {
	        int[] arr = new int[201];
	        int answer = 0;
	        for (int[] line : lines) {
	            int a = line[0] + 100;
	            int b = line[1] + 100;
	            while (a<=b) {
	                if (++arr[a++] == 2) answer++;
	            }
	        }
	        return answer;
	    }
}
