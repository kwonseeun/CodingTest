package programmers;

import java.util.ArrayList;

public class P_배열의원소만큼_추가하기 {
	 public int[] solution(int[] arr) {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        
	        for (int tmp : arr) {
	            for (int i = 0;i < tmp;i++)
	                arrayList.add(tmp);
	        }
	        
	        int idx = 0;
	        int[] answer = new int[arrayList.size()];
	        
	        for (int tmp : arrayList)
	            answer[idx++] = tmp;
	        
	        return answer;
	    }
}
