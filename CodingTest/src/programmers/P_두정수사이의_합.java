package programmers;

public class P_두정수사이의_합 {
	 public long solution(int a, int b) {
	        //1. for문
	        /*
	        long answer = 0;
	        if(a==b) answer=a;
	        else {
	            for(long i=Math.min(a,b);i<=Math.max(a,b);i++){
	                answer +=i;
	            }
	        }
	        return answer;
	        */
	        
	        // 2.등비수열공식
	        return sumAtoB(Math.min(a,b),Math.max(a,b));
	    }
	    private long sumAtoB(long a, long b){
	        return (b-a+1)*(a+b)/2;
	    }
}
