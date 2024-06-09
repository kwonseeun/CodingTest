package programmers;

import java.util.Arrays;

public class P_n의배수고르기 {
	class Solution {
	    public int[] solution(int n, int[] numList) {
	        return Arrays.stream(numList).filter(v -> v % n == 0).toArray();
	    }
	}
}
