package programmers;

public class P_약수의합 {
	 public int solution(int n) {
	        int answer = 0;
	        
	        //1. 정수 n 입력받기
	        //2. n의 약수 찾고 더하기
	        for(int i =1; i<=n/2 ;i++){
	            if(n%i == 0){
	                answer += i;
	            }
	        } 
	        
	        return answer + n;
	    }
}
