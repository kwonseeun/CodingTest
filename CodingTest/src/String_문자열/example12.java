package String_문자열;

import java.util.Scanner;

/** 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
 * 비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱개로 구성되어 있습니다.
 * 만약 현수가  #*****# 으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다
 * 1. #******# 를 일곱자리의 이진수로 바꾼다. #은 이진수의1로 *이진수의 0으로 변환한다. 
 * 결과는 10000001로 변환 
 * 2. 바뀐 2진수를 10진수화 한다. 1000001을 10진수화 하면 65가 된다.
 * 3. 아스키 번호가 65문자로 변환한다. 즉 아스키번호 65는 대문자 A 
 * 참고로 대문자들의 아스키 번호는 A는 65번, B는 66번, C는 67번 등 차례대로 1씩 증가하여 
 * Z 는 90이다. 현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요. */
public class example12 {
// *->이진수 / 이진수->10진수 / 10진수 아스키코드 
	
	public String solution(int n, String s) {
		String answer ="";
		
		for (int i = 0; i < n; i++) { //i = 0 일때 7개를 substring 으로 끊어낸다 
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			
			answer += (char)num; // num 을 문자열로 cast 해서 넣어준다 
			System.out.println(tmp+" "+num);
			s = s.substring(7); 
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		example12 e = new example12();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(e.solution(n, str));
	}

}
