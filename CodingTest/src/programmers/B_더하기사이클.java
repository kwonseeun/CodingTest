package programmers;

import java.util.Scanner;

public class B_더하기사이클 {
	 public static void main(String args[]){

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int cnt = 0;
	        int answer = n;

	        do {
	            answer = ((answer % 10) * 10) + (((answer /10) + (answer % 10)) % 10);
	            cnt++;
	        } while (answer != n);
	        System.out.println(cnt);
	    }
}
