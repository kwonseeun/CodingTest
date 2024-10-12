package programmers;

public class P_핸드폰번호_가리기2 {
	public String solution(String phone_number) {
        String answer = "";

        //char 배열에 담는다.
        //배열 길이의 -4만큼의 인덱스까지의 인자는 *로 바꾼다.
        //배열을 문자열로 변환한다.

        char[] num = phone_number.toCharArray();

        for(int i = 0;i<num.length-4;i++){
            num[i] = '*';
        }

        answer = String.valueOf(num);

        return answer;
    }
}
