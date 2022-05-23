package codingDojang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.*/
public class example10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9까지 숫자를 입력해주세요: ");
		
		String[] in = sc.next().split("");
		
		ArrayList<String> temp = new ArrayList<String>(Arrays.asList(in));
		
	}

}
