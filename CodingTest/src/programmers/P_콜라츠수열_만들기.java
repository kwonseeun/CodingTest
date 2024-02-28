package programmers;

import java.util.ArrayList;

public class P_콜라츠수열_만들기 {
	public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int cnt = 0;
        
        while (n >= 1) {
            arrayList.add(n);
            if (n == 1) break;
            if (n % 2 == 0)
                n = n / 2;
            else 
                n = 3 * n + 1;
        }
        
        int[] answer = new int[arrayList.size()];
        
        for (int data : arrayList)
            answer[cnt++] = data;
            
        return answer;
    }
}
