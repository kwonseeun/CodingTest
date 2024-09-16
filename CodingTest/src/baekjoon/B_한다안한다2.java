package baekjoon;

import java.util.Scanner;

public class B_한다안한다2 {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();

        for(int i=0;i<n;i++){

            String ch=scanner.next();

            char[] N=ch.toCharArray();

            int NN=N.length/2;

            if(N[NN-1]==N[NN]){
                System.out.println("Do-it");
            }else{
                System.out.println("Do-it-Not");
            }
        }
    }
}
