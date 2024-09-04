package baekjoon;

import java.util.Scanner;

public class B_남욱이의담장 {
	 public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);

	        int t=scanner.nextInt();
	        int n,m;
	        int u=0;

	        for(int i=0;i<t;i++){
	            n=scanner.nextInt();
	            m=scanner.nextInt();

	            u=m*2-n;

	            System.out.println(u+" "+(n-m));
	        }
	    }
}
