package programmers;

import java.util.Arrays;

public class P_뒤에서_5등위로 {
	public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int idx = 0;
        int[] answer = new int[num_list.length - 5];
        for (int i = 5;i < num_list.length;i++)
            answer[idx++] = num_list[i];
        return answer;
    }
}
