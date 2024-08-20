package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class P_문자열_내맘대로_정렬하기 {
	 public String[] solution(String[] strings, int n) {
	        ArrayList<String> answer = new ArrayList<>();
	        for(int i=0; i<strings.length; i++){
	            answer.add("" + strings[i].charAt(n) + strings[i]);
	        }
	        Collections.sort(answer);
	        String[] result = new String[strings.length];
	        for(int i=0; i<strings.length; i++){
	            result[i] = answer.get(i).substring(1, answer.get(i).length());
	        }
	        return result;
	    }
}
