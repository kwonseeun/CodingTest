package programmers;

public class P_행렬의덧셈 {
	 public int[][] solution(int[][] a, int[][] b) {
	        int[][] result = a.clone();
			for(int i=0;i<a.length; i++) {
				for(int j=0;j<a[i].length; j++) {
					result[i][j] =a[i][j]+b[i][j];
				}
			}
			return result;
	  }
}
