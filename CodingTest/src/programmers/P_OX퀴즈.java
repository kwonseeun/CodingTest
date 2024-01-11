package programmers;

import java.util.Arrays;

public class P_OX퀴즈 {
	 public static void main(String[] args) {
//       System.out.println(solution("abc1abc1abc"));
       System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
//       for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//           System.out.println(Arrays.toString(a));
//       }
   }

   public static String[] solution(String[] quiz) {
       String[] answer = new String[quiz.length];
       for(int i=0; i< quiz.length; i++){
           String str[] = quiz[i].split(" ");
           int minus = str[0].contains("-") ? -1 : 1;
           int x = minus*Integer.parseInt(str[0].replace("-",""));
           minus = str[2].contains("-") ? -1 : 1;
           int y = minus*Integer.parseInt(str[2].replace("-",""));
           minus = str[4].contains("-") ? -1 : 1;
           int z = minus*Integer.parseInt(str[4].replace("-",""));
           if(str[1].equals("+")){
               if(x+y == z){
                   answer[i] = "O";
               }else{
                   answer[i] = "X";
               }
           }else{
               if(x-y == z){
                   answer[i] = "O";
               }else{
                   answer[i] = "X";
               }
           }
       }
       return answer;
   }
}
