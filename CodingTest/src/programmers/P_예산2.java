package programmers;

import java.util.Arrays;

public class P_예산2 {
	   public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        for(int each : d) {
	            if((budget - each) >= 0) {
	                budget -= each;
	                answer += 1;
	            } else {
	                break;
	            }
	        }
	        return answer;
	    }
}
