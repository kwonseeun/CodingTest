package programmers;

import java.util.HashSet;

public class P_폰켄몬 {
	 public int solution(int[] nums) {
	        int answer = 0;
	        HashSet <Integer> type = new HashSet<>();
	        for(int i = 0; i < nums.length; i++)
	            type.add(nums[i]);
	        
	        if(type.size() >= nums.length / 2)
	            answer = nums.length / 2;
	        else
	            answer = type.size();
	        return answer;
	    }
}
