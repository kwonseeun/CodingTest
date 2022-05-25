package codingDojang;

import java.util.Scanner;

public class example17_1 {
	/** 0-9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지 숫자가 각각 한번씩만 사용된 것인지확인하는 
	 * 함수를 구하시오 */
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] checkPoint={"0","1","2","3","4","5","6","7","8","9"};
	        String[] tmp;
	        int cnt=0;

	        while(true){
	            System.out.print("write number :");
	            tmp=sc.next().split("");

	            if(tmp.length!=10){
	                System.out.println("false");
	                continue;
	            }

	            for(int i=0;i<10;i++){
	                for(int j=0;j<10;j++){
	                    if(tmp[i].equals(checkPoint[j])){
	                        checkPoint[j]=null;
	                        cnt++;
	                    }
	                    else{
	                    }
	                }//end inner forloop
	            }//end outer forloop

	            if(cnt==10){
	                System.out.println("true");             
	            }
	            else{
	                System.out.println("false");
	            }

	        }//end while
	    }//end main}
}
