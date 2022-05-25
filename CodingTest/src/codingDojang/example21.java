package codingDojang;

import java.util.Scanner;

/**숫자를 입력받으면 그에 해당하는 자릿수를 출력하라 */
public class example21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < a.length(); i++) {
			if (i == 0) {
				sb.append("1");
			}else {
				sb.append("0");
			}
		}
		System.out.println(a + "는 " + sb + "의 자릿수 ");
		
	}

}
