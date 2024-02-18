package programmers;

import java.util.Scanner;

public class B_과자 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int k = sc.nextInt();
	        int n = sc.nextInt();
	        int m = sc.nextInt();

	        int answer = m - (n * k);

	        if (answer < 0) {
	            System.out.println(Math.abs(answer));
	        } else {
	            System.out.println(0);
	        }
	        sc.close();
	    }
}
