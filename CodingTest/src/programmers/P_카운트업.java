package programmers;

public class P_카운트업 {
	 public int[] solution(int start, int end) {
	        int num = end - start + 1;
	        int[] answer = new int[num];

	        for (int i = 0; i < num; i++) {
	            answer[i] = start + i;
	        }
	        return answer;
	    }
}
