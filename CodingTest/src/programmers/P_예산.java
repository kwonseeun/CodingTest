package programmers;

import java.util.Arrays;

public class P_예산 {
	 public int solution(int[] value, int budget) {
	        int tmp = 0;
			int count = 0;
			Arrays.sort(value);
			
	         for(int a : value){
	              if(tmp < budget) {
	                    tmp += a;
	               }
	             if(tmp > budget){
	                    return count;
	             }else if( tmp == budget ){
	                    return ++count;
	             }else{
	                    count++;
	             }
	         }
			return count;
	    }
}
