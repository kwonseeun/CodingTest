package baekjoon;

import java.util.Scanner;

public class B_마이너스2진수 {
	  public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);

	        int n= scanner.nextInt();

	        String num="";

	        if(n==0){
	            System.out.println(0);
	        }

	        while(true){

	            if(n==0){
	                break;
	            }else if(n%(-2)==-1){
	                num=(n%(-2))+2+num;
	                n=n/(-2)+1;
	            }else{
	                num=(n%(-2))+num;
	                n=n/(-2);
	            }
	        }

	        System.out.println(num);
	    }
}
