package programmers;

public class P_순위2 {
	 static int[][] floyd;

	    public int solution(int n, int[][] arr) {
	        int answer = 0;
	        floyd = new int[n][n];

	        for (int i = 0; i < arr.length; i++) {
	            int aPerson = arr[i][0];
	            int bPerson = arr[i][1];

	            floyd[aPerson - 1][bPerson - 1] = 1; // 행 사람이 열 사람을 이겼다라는 의미
	        }

	        for (int i = 0; i < n; i++) { // 중간
	            for (int j = 0; j < n; j++) { // 시작
	                for (int k = 0; k < n; k++) { // 끝

	                    // 시작 ~ 중간, 중간 ~ 끝 을 모두 판단할 수 있는 경우 확실하게 등수를 결정지을 수 있다.
	                    if (floyd[j][i] == 1 && floyd[i][k] == 1) {
	                        floyd[j][k] = 1;
	                    }
	                }
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            int result = 0; // 시합 횟수

	            for (int j = 0; j < n; j++) {
	            
	            	// 행 기준이든 열 기준이든 1이라면 시합 결과가 있다는 소리니까
	                if (floyd[i][j] == 1 || floyd[j][i] == 1) { 
	                    result++; // 시합 횟수를 증가시킨다.
	                }
	            }

	            if (result == n - 1) {
	                answer++;
	            }
	        }


	        return answer;
	    }
}
