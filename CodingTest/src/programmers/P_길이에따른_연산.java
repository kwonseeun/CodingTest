package programmers;

public class P_길이에따른_연산 {
	 public int solution(int[] num_list) {
	        int answer = 0;

	        if(num_list.length >= 11){
	            for(int i = 0; i < num_list.length; i++){
	                answer += num_list[i];
	            }
	        }else{
	            answer = 1;
	            for(int i = 0; i < num_list.length; i++){
	                answer *= num_list[i];
	            }
	        }
	        return answer;
	   	 }
}
