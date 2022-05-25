package codingDojang;

import java.util.Arrays;

/**1~1000에서 각 숫자의 갯수 구하기*/
public class example19 {

	public static void main(String[] args) {
		int box[] = new int[10];

        for(int i=1; i <=1000;i++){
            box[i%10]++;
            if(i>=10) box[(i/10)%10]++;
            if(i>=100) box[(i/100)%10]++;
            if(i==1000) box[1]++;
        }
        System.out.println(Arrays.toString(box));
	}

}
