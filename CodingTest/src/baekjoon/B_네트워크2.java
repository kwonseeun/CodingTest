package baekjoon;

import java.util.LinkedList;
import java.util.Queue;

public class B_네트워크2 {
	class Solution {
	    public boolean[] visited;
	    int answer =0; 
	    public int solution(int n, int[][] computers) {
	        visited = new boolean[n];
	        for(int i=0; i<n; i++){
	            if(!visited[i]){
	                visited[i] = true;
	                bfs(i, n, computers);
	                answer++;
	            }
	            
	        }
	        return answer;
	    }
	    
	    public void bfs(int i, int n, int[][] computers){
	        Queue<Integer> queue = new LinkedList<>();
	        queue.offer(i);
	        
	        while(!queue.isEmpty()){
	            int now = queue.poll();
	            
	            for(int j=0; j<n; j++){
	                if(j !=now 
	                   && computers[now][j] ==1 
	                   && !visited[j]){
	                    visited[j] = true;
	                    queue.offer(j);
	                }
	            }
	            
	        }
	        
	    }
	}
}
