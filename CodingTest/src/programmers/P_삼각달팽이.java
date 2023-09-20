package programmers;

public class P_삼각달팽이 {
	 public int[] solution(int n) {
	        int[][] map = new int[n][n];
	        
	        int num = 1;
	        int x= -1, y = 0;
	        
	        for(int i = 0; i < n; i++){
	            for(int j = i; j < n; j++){
	                if(i % 3 == 0){
	                    x++;
	                }else if(i % 3 == 1){
	                    y++;
	                }else{
	                    x--;
	                    y--;
	                }
	                
	                map[x][y] = num++;
	            }
	        }
	        
	        
	        int[] answer = new int[n*(n+1)/2];
	        int idx = 0;
	        
	        for(int i = 0; i < n; i++){
	            for(int j = 0; j <= i; j++){
	                answer[idx++] = map[i][j];
	            }
	        }
	        
	        return answer;
	    }
}
