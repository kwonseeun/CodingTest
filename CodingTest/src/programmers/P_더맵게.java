package programmers;

import java.util.PriorityQueue;

public class P_더맵게 {
	 public int solution(int[] scoville, int K) {
	        
	        PriorityQueue<Integer> q = new PriorityQueue<>();
	        
	        for(int s : scoville){
	            q.offer(s);
	        }
	        
	        int cnt = 0;
	        while(q.size() > 1 && q.peek() < K){
	            int a = q.poll();
	            int b = q.poll()*2;
	            q.offer(a+b);
	            cnt++;
	        }
	        
	        return q.peek() < K ? -1 : cnt;
	    }
}
