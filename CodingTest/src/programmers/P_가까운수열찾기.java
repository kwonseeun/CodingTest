package programmers;

public class P_가까운수열찾기 {
	 public int solution(int[] arr, int idx) {
	        
	        for (int i = idx;i < arr.length;i++)
	            if (arr[i] == 1)
	                return i;
	        return -1;
	    }
}
