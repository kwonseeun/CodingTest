package programmers;

public class P_다음에_올수 {
	 public int solution(int[] common) {
	        int answer = 0;
	        
	        if((common[1] - common[0]) == (common[2] - common[1])){
	            answer = common[common.length -1] +1;
	            
	        }else {
	           answer = common[common.length -1] * 2;
	        }
	        
	        return answer;   
	        
	    }
}
