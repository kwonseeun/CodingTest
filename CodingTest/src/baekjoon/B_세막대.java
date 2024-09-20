package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_세막대 {
	 public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);

	        int num[] = new int[3];
	        int sum=0;

	        for(int i=0;i<3;i++){
	            num[i]=scanner.nextInt();
	            sum=sum+num[i];
	        }

	        Arrays.sort(num);

	        if(num[0]+num[1] <= num[2]){
	            System.out.println(2*(num[0]+num[1])-1);
	        }else{
	            System.out.println(sum);
	        }
	    }
}
