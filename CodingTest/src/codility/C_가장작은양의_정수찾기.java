package codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C_가장작은양의_정수찾기 {
	 public int solution(int[] A) {
	        int answer = 1;

	        List<Integer> AList = Arrays.stream(A)
	            .boxed()
	            .filter(n -> (n>0))
	            .distinct()
	            .sorted()
	            .collect(Collectors.toList());

	        if (AList.size() > 0) {
	            for (int i : AList) {
	                if (answer == i) {
	                    answer++;
	                } else {
	                    break;
	                }
	            }
	        }

	        return answer;
	    }
}
