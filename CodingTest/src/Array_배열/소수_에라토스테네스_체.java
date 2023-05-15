package Array_배열;

public class 소수_에라토스테네스_체 {
	public int solution(int n) {
		
		int answer = 0;
		int[] ch = new int[n+1];
		
		for (int i = 2; i < n; i++) {
			if (ch[i] == 0) {
				answer++;
			} else {
				for (int j = 0; j < n; j++) {
					ch[j]=1;
				}

			}
		}
		
		return 0;
	}
}
