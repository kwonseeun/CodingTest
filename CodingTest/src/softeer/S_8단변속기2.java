package softeer;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class S_8단변속기2 {
	 public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        int[] arrInput = new int[8];
	        for(int i = 0 ; i < 8 ; i++){
	            arrInput[i] = sc.nextInt();
	        }

	        int[] ascending = new int[]{1,2,3,4,5,6,7,8};

	        int[] descending = new int[]{8,7,6,5,4,3,2,1};

	        if(Arrays.equals(arrInput, ascending)){
	            System.out.println("ascending");
	        } else if(Arrays.equals(arrInput, descending)){
	            System.out.println("descending");
	        } else {
	            System.out.println("mixed");
	        }
	    }
}
