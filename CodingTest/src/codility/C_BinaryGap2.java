package codility;

public class C_BinaryGap2 {
	 public int solution(int N) {
	        String str = Integer.toBinaryString(N);
	        String [] arr = str.split("");
	        int count = 0;
	        int result = 0;
	        for(int i=0; i<arr.length; i++){
	            if(arr[i].equals("0")){
	                count++;
	            } else {
	                result = Math.max(count, result);
	                count = 0;
	            }
	        }
	        return result;
	    }
}
