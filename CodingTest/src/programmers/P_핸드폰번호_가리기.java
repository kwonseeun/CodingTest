package programmers;

public class P_핸드폰번호_가리기 {
	
	/*프로그래머스 모바일은 개인정보를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가린다 */

		public String solution(String phone_number) {
			String answer="";
			int n = phone_number.length();
			
			
			for (int i = 0; i < n; i++) {
				if(i<n -4) {
					answer="*";
				} else {
					answer+=phone_number.substring(i);
					break;
				}
			}
			return answer;
		}
}
