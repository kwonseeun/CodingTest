package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B_단순한문제 {
	 public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);

	        int T= scanner.nextInt();

	        for(int i=0;i<T;i++){
	            List<Integer> num=new ArrayList<Integer>(5);

	            for(int j=0;j<3;j++){
	                num.add(scanner.nextInt());
	            }
	            System.out.println(Collections.min(num));
	        }
	    }
}
