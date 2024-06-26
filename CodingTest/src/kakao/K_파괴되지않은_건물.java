package kakao;

public class K_파괴되지않은_건물 {
public static int[][] boards;
    
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;
        boards = board;
        
        
        for(int[] s:skill){
            do_skill(s);
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(boards[i][j] > 0) answer++;
            }
        }
        
        return answer;
    }
    
    public static void do_skill(int[] s){
        int r1 = s[1];
        int c1 = s[2];
        int r2 = s[3];
        int c2 = s[4];
        int degree = s[5];
        if(s[0] == 1){
            for(int i=r1;i<=r2;i++){
                for(int j=c1;j<=c2;j++){
                    boards[i][j] -= degree;
                }
            }
        } else {
            for(int i=r1;i<=r2;i++){
                for(int j=c1;j<=c2;j++){
                    boards[i][j] += degree;
                }
            }
        }
    }
}
