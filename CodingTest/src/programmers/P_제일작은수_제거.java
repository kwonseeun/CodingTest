package programmers;

import java.util.Arrays;

public class P_제일작은수_제거 {
	 public int[] solution(int[] arr) {
		  if(arr.length == 1) {
		        return new int[] {-1};
		    }else {
		        int[] copyArr = arr.clone();
		        int count = 0;
		        Arrays.sort(arr);
		        int[] result = new int[arr.length-1];
		        for(int i=0; i<arr.length; i++) {
		            if(copyArr[i] == arr[0]) {
		                continue; 
		            }
		            result[count++] = copyArr[i];
		        }
		        return result;
		    }
		  }
}
