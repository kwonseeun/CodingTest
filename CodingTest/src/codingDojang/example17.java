package codingDojang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/** 0-9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지 숫자가 각각 한번씩만 사용된 것인지확인하는 
 * 함수를 구하시오 */
public class example17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		String[] in = sc.next().split("");
		
		ArrayList<String> temp = new ArrayList<String>(Arrays.asList(in));
		
		int sum = 0;
		
		Collections.sort(temp);
		for (int i = 0; i < temp.size()-1; i++) {
			if (temp.get(i).equals(temp.get(i+1))) {
				sum++;
				break;
			}
		}
		if (sum > 0 || temp.size() != 10) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}		
	}

}
