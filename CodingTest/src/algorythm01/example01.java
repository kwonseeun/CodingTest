package algorythm01;

import java.util.Scanner;

/**1. 문자 찾기 
 * 한 개의 문자열을 입력받고, 특정 문자열을 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지알아내는 
 * 프로그램, 대소문자를 구분하지 않고 문자열의 길이는 100을 넘지 않는다. */
public class example01 {
	public int solution (String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase(); //str 이 대문자로 변환 
		t = Character.toUpperCase(t); // 문자니까 character 클래스 메소드를 사용한다.
		System.out.println(str + "" + t );
		
		for (int i = 0; i < str.length(); i++) { // str의 길이만큼 반복문 실행 , 하지만 0번째부터 시작이니까 안된 
			if (str.charAt(i) == t)  answer ++; // 문자를 한개 한개 index 탐색 접근한다  
		}
		return answer; // answer리턴 하면서 갯수출력 

	}
	
	public static void main(String[] args) {	
		example01 e = new example01();
		Scanner sc = new Scanner(System.in);	
		
		String str =sc.next(); // 문자열 하나를 읽어들인다.
		char c = sc.next().charAt(0); // character 변수 문자 하나를 리턴한다 
		
		System.out.println(e.solution(str, c));
	}
		
}
