package softeer;

import java.util.Scanner;

public class S_지도자동구축 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

//	        double a = Math.pow(2,n) + 1; //한 면의 점 개수
//	        double answer = Math.pow(a,2); //정답은 점 개수의 제곱이다.
	        System.out.println((long)Math.pow(Math.pow(2,n)+1,2));
	    }
}
