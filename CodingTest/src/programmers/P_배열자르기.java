package programmers;

import java.util.ArrayList;

public class P_배열자르기 {
public int[] solution(int n, long left, long right) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(long i = left ; i <= right; i++){
            int h = (int)(i / n);
            int w = (int)(i%n);
            
            if(h>w){
                answer.add(h+1);
            }else{
                answer.add(w+1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
