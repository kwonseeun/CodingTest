package codility;

import java.util.HashSet;

public class C_permCheck {
	public int solution(int[]A) {
		
		int result = 1;
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i : A) hashSet.add(i); 
		for (int i=1; i<A.length; i++) {
			if (!hashSet.contains(i)) {
				result = 0;
				break;
				}
			}
		return result;
	}
}
