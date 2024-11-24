package programmers;

public class P_uglyNumber {
	 public int nthUglyNumber(int n) {
	        int[] ugly = new int[n+1];
	        ugly[1] = 1;
	        int idx2=1, idx3=1, idx5=1;
	        for(int i=2; i <= n; i++) {
	            ugly[i] = Math.min(ugly[idx2]*2, Math.min(ugly[idx3]*3, ugly[idx5]*5));
	            if(ugly[i]==ugly[idx2]*2) idx2++;
	            if(ugly[i]==ugly[idx3]*3) idx3++;
	            if(ugly[i]==ugly[idx5]*5) idx5++;
	        }
	        return ugly[n];
	}
}
