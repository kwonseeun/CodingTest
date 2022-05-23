package codingDojang;

import java.util.Scanner;

public class example13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어를 입력하세요: ");
		String str = sc.nextLine();
		System.out.println("갯수를 알고싶은 문자를 입력하세요 ");
		char a = sc.next().charAt(0);
		
		
		// 카운트 
		int count = 0;
		
		// 50자 이내 조건
		if(str.length() > 50 ) {
			return;
	}
	for(int i = 0; i< str.length(); i ++) {
		if(str.charAt(i) == a) {
			count++;
		}
	}
		System.out.println(count);
	}
}
