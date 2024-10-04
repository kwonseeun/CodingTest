package softeer;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class S_8단변속기 {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arrInput = new int[8];
        for(int i = 0 ; i < 8 ; i++){
            arrInput[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(arrInput));

        int[] ascending = new int[8];
        for(int i = 0 ; i < 8 ; i++){
            ascending[i] = i+1;
        }
        int[] descending = new int[8];
        for(int i = 0, j = 8 ; i < 8; i++, j--){
            descending[i] = j;
        }
        //System.out.println(Arrays.toString(asending));
        //System.out.println(Arrays.toString(desending));

        if(Arrays.equals(arrInput, ascending)){
            System.out.println("ascending");
        } else if(Arrays.equals(arrInput, descending)){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
      
	}
}
