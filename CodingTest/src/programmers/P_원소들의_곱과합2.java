package programmers;

public class P_원소들의_곱과합2 {
	 public int solution(int[] num_list) {
	        int sum = 0;
	        int mul = 1;
	        for (int i = 0; i < num_list.length; i++) {
	            sum += num_list[i];
	            mul *= num_list[i];
	        }

	        if (mul < Math.pow(sum, 2)) {
	            return 1;
	        } else return 0;
	   	  }
}
