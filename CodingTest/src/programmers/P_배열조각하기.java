package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class P_배열조각하기 {
	public static void main(String[] args) {
//      System.out.println(solution(new int[]{9, 1, 5, 3, 6, 2}));
      System.out.println(Arrays.toString(solution(new int[]{0, 1, 95, 3, 4, 5}, new int[]{4, 1, 2})));
//      for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//          System.out.println(Arrays.toString(a));

  }

  public static int[] solution(int[] arr, int[] query) {
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
          list.add(arr[i]);
      }
      for (int i = 0; i < query.length; i++) {
          if (i % 2 == 0) {
              while (true) {
                  int idx = query[i] + 1;
                  if (idx >= list.size()) {
                      break;
                  }
                  list.remove(idx);
              }
          } else {
              int idx = 0;
              while (true) {
                  if (idx == query[i]) {
                      break;
                  }
                  list.remove(0);
                  idx++;
              }
          }
//          System.out.println(list);
      }
      int[] answer = new int[list.size()];
      for (int i = 0; i < list.size(); i++) {
          answer[i] = list.get(i);
      }
      return answer;
  }
}
