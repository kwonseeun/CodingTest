package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class P_접미사배열 {
	public String[] solution(String my_string) {
        int n = my_string.length();
        int cnt = 0;
                
        ArrayList<String> arrayList = new ArrayList<>();
        
        for (int i = my_string.length() - 1;i >= 0;i--) {
            String subStr = my_string.substring(i, n);
            if (!arrayList.contains(subStr));
                arrayList.add(subStr);
        }
        
        Collections.sort(arrayList);
        
        String[] answer = new String[arrayList.size()];
        for (String data : arrayList)
            answer[cnt++] = data;
        return answer;
    }
}
