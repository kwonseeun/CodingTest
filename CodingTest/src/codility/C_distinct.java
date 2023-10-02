package codility;

import java.util.HashSet;

public class C_distinct {
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	        HashSet<Integer> set = new HashSet<>();
	        for (int a : A) {
	            set.add(a);
	        }

	        return set.size();
	    }
}
