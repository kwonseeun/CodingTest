package kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class K_개인정보수집_유효기간 {
	public int[] solution(String today, String[] terms, String[] privacies) {
        int day = getDay(today); // 금일 기준 일 수
        
        Map<String, Integer> map = new HashMap<>();
        for (String term : terms) { // 약관 정보 map으로 관리
            String[] arr = term.split(" ");
            map.put(arr[0], Integer.valueOf(arr[1]));
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] arr = privacy.split(" ");
            
            // 기간 지나면 파기
            if (day >= getDay(arr[0]) + map.get(arr[1]) * 28) {
                al.add(i + 1); // 0부터 시작하므로
            }
        }
        
        int[] answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
    
    private int getDay(String today) { // 일수 구하기
        String[] arr = today.split("\\.");
        int y = Integer.valueOf(arr[0]);
        int m = Integer.valueOf(arr[1]);
        int d = Integer.valueOf(arr[2]);
        return (y * 12 * 28) + (m * 28) + d;
    }
}
