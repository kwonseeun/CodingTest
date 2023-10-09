package codility;

public class C_countDive {
	public int solution(int A, int B, int K) {
		int init = 0;
		for (int i = A; i <= B; i++) {
			if (i % K == 0) {
				init = i;
				break;
			}
		}
		
		if (A==B) return A%K == 0 ? 1 : 0;
		int result = B/K - init/K +1;
		return result;
	}
}
