package baekjoon;

import java.util.Scanner;

public class B_배수찾기 {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();

        while(true){
            int num= scanner.nextInt();

            if(num==0){
                break;
            }

            if(num%n==0){
                System.out.println(num+" is a multiple of "+n+".");
            }else{
                System.out.println(num+" is NOT a multiple of "+n+".");
            }
        }
    }
}
