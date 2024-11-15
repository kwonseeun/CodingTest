package programmers;

import java.util.Arrays;

public class P_쌍둥이빌딩숲 {
	private static final int DIV = 1_000_000_007;

	  private static final int[][] mem = new int[101][101];

	  static {
	    for (int[] row : mem) {
	      Arrays.fill(row, -1);
	    }

	    for (int n = 0; n <= 100; n++) {
	      mem[n][0] = 0;
	      for (int c = n + 1; c <= 100; c++) {
	        mem[n][c] = 0;
	      }
	    }
	    mem[0][0] = 1;
	  }

	  public int solution(int n, int count) {
	    if (mem[n][count] != -1) return mem[n][count];

	    long sum = solution(n - 1, count - 1);
	    sum += (long) solution(n - 1, count) * 2 * (n - 1);

	    return mem[n][count] = (int) (sum % DIV);
	  }
}
