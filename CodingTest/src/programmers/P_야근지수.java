package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class P_야근지수 {
	public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐 선언 + 내림차순 정렬

        for (int j : works) {
            pq.offer(j);
        }

        while (n > 0) {
            int work = pq.poll();
            if (work == 0) break;
            work -= 1;
            pq.offer(work);
            n -= 1;
        }

        for (int work : pq) {
            answer += (long) work * work;
        }
        return answer;
    }
}
