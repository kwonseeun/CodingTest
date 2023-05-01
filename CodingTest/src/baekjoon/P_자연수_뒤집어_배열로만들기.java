package baekjoon;

public class P_자연수_뒤집어_배열로만들기 {
	 public int[] solution(long n) {
	        int[] nList = new int[(int)(Math.log10(n)+1)];
	        int count = 0;

	        while (n > 0) {
	            nList[count] = (int)(n % 10);
	            n /= 10;
	            count++;
	        }
	        return nList;
	    }
}
