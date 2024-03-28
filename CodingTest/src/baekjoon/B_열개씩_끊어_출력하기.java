package baekjoon;

import java.util.Scanner;

public class B_열개씩_끊어_출력하기 {
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       String N = sc.next(); // 단어 받기

	        for (int i = 0; i < N.length(); i++) {
	            if (i % 10 == 0 && i != 0)
	                System.out.println();
	            System.out.print(N.charAt(i));
	            }
	        }
}
