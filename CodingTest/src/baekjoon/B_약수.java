package baekjoon;

import java.util.Scanner;

public class B_약수 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        while (n-- > 0) {
	            int k = in.nextInt();
	            if (k < min) {
	                min = k;
	            }
	            if (k > max) {
	                max = k;
	            }
	            
	            /*
	            min = k < min ? k : min;
	            max = k > max ? k : max;
	            */
	            
	        }
	        System.out.println(min * max);

	    }
}
