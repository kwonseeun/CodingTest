package programmers;

import java.util.Arrays;

public class P_구명보트2 {
	 public int solution(int[] people, int limit) {
	        int answer = 0;
	        int tmp = 0;

	        Arrays.sort(people);

	        for (int i = people.length - 1; i >= tmp; i--) {
	            if (people[i] + people[tmp] > limit) {
	                answer++;
	            } else {
	                answer++; // 둘이 태울수 있으므로 answer1증가
	                tmp++;
	            }
	        }
	        return answer;
	    }
}
