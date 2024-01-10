package programmers;

public class P_안전지대 {
	public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}));
//        System.out.println(Arrays.toString(solution(1, 4, 2, 16)));
//        for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//            System.out.println(Arrays.toString(a));
//        }
    }

    static int Y[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int X[] = {0, 1, -1, -1, 1, 0, 1, -1};

    public static int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < Y.length; k++) {
                        int ny = Y[k] + i;
                        int nx = X[k] + j;
                        if (ny < 0 || nx < 0 || ny >= board.length || nx >= board[i].length)
                            continue;
                        if (board[ny][nx] == 0) {
                            board[ny][nx] = 2;
                        }
                    }
                }
            }
        }
        for (int[] a : board) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
