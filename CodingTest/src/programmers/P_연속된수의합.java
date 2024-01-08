package programmers;

import java.util.Arrays;

public class P_연속된수의합 {
	public static void main(String[] args) {
//      System.out.println(solution(new int[]{1, 7, 1, 2}));
      System.out.println(Arrays.toString(solution(4, 14)));
//      for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//          System.out.println(Arrays.toString(a));
//      }
  }

  public static int[] solution(int num, int total) {
      int[] answer = new int[num];
      int middle = total / num;
      answer[0] = middle;
      int idx = 1;
      int sum = 0;
      for (int i = 1; i < num; i += 2) {
          answer[i] = middle + idx;
          if (i + 1 < answer.length) {
              answer[i + 1] = middle - idx;
          }
          idx++;
      }

      Arrays.sort(answer);
      return answer;
  }
}
