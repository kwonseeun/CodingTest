package kakao;

import java.util.Stack;

public class K_크레인인형뽑기 {
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> temp = new Stack<>();
        temp.push(0);

        for(int move : moves) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][move-1] != 0) {
                    if(board[j][move-1] == temp.peek()) {
                        answer+=2;
                        temp.pop();
                    } else {
                        temp.push(board[j][move - 1]);
                    }
                    board[j][move-1] = 0;
                    break;
                }
            }
        } return answer;
    }
}
