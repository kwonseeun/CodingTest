package baekjoon;

import java.util.Scanner;

public class B_A더하기B빼기6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int t = sc.nextInt();

	        for (int i = 0; i < t; i++) {
	            String[] str = sc.next().split(",");
	            System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
	        }
	    }
}
