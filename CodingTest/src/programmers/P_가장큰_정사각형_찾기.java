package programmers;

public class P_가장큰_정사각형_찾기 {

    public int solution(int [][]board)
    {
        int result = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                
                if(i > 0 && j > 0 && board[i][j] == 1){ // 현재 좌표가 1일때
                    board[i][j] = Math.min(board[i-1][j-1],Math.min(board[i-1][j],board[i][j-1]))+1; // 정사각형 중 가장 작은 숫자+1
                }
                result = Math.max(result,board[i][j]); // 최대길이 체크
            }
        }

        return result*result; // 넓이 반환
    }
}
