package softeer;

import java.util.Scanner;

public class S_바이러스 {
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int K = sc.nextInt();
	        int P = sc.nextInt();
	        int N = sc.nextInt();

	        long result = K;
	        for (int i=1; i<=N; i++) {
	            result = (result*P)%1000000007;
	        }
	       System.out.println(result);

	    }
}
