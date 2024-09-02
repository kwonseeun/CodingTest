package baekjoon;

import java.util.Scanner;

public class B_나이계산하기 {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int y1= scanner.nextInt();
        int m1= scanner.nextInt();
        int d1= scanner.nextInt();

        int y2= scanner.nextInt();
        int m2= scanner.nextInt();
        int d2= scanner.nextInt();

        int age1,age2,age3;

        if(m1<m2){
            age1=y2-y1;
        }else if(m1==m2 && d1<=d2){
            age1=y2-y1;
        }else{
            age1=y2-y1-1;
        }

        age2=y2-y1+1;
        age3=y2-y1;

        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);
    }
}
