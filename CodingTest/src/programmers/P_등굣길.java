package programmers;

public class P_등굣길 {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int[][] dp = new int[n+1][m+1];
        
        int div = 1_000_000_007;
        
        for(int[] puddle : puddles){
            int y = puddle[0];
            int x = puddle[1];
            dp[x][y] = -1;
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(dp[i][j] == -1){
                    dp[i][j] = 0;
                    continue;
                }
                if(i == 1 && j == 1){
                    dp[1][1] = 1;
                }else{
                    dp[i][j] = (dp[i-1][j]+ dp[i][j-1]) %div;
                }
            }
        }
        
        return dp[n][m];
    }

}
