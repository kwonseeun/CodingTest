package programmers;

public class P_가장가까운_같은글자 {
	 public int[] solution(String s) {
	        int[] answer = new int[s.length()];
	        StringBuilder sb = new StringBuilder("");
	        for(int i = 0; i < s.length(); i++) {
	            if(sb.lastIndexOf(String.valueOf(s.charAt(i))) == -1)
	                answer[i] = -1;
	            else
	                answer[i] = i - sb.lastIndexOf(String.valueOf(s.charAt(i)));
	            
	            sb.append(String.valueOf(s.charAt(i)));
	        }
	        return answer;
	    }
}
