package programmers;

import java.util.Arrays;

public class P_구명보트 {
	  public int solution(int[] people, int limit) {
	        int answer = 0;
	        
	        Arrays.sort(people);
	        
	        int start = 0;
	        int end = people.length-1;
	        
	        while(start <= end){
	            // 2명탑승
	            if(people[start] + people[end] <= limit){
	                start++;
	                end--;
	                answer++;
	            // 가장 무거운사람 한명 탑승
	            }else{
	                end--;
	                answer++;
	            }
	        }
	        return answer;
	    }
}
