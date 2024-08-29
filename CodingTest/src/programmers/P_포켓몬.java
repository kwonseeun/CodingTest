package programmers;

import java.util.HashMap;
import java.util.Map;

public class P_포켓몬 {
	public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        if (map.keySet().size() > count) {
            return count;
        } else {
            return map.keySet().size();
        }
    }
}
