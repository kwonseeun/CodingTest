package codility;

import java.util.HashSet;
import java.util.Set;

public class C_MissingInteger {
	public int solution(int[] A) {
		int result = 1;
		
		Set<Integer> set = new HashSet<>();
		for (int i : A) if (i>0) set.add(i); {
			
			for (int i = 0; i < set.size()+1; i++) {
				if(!set.contains(i)) {
					result = i;
					break;
				}
			}
			return result;
		} 
	}
}
