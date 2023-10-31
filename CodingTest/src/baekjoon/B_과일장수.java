package baekjoon;

import java.util.Arrays;

public class B_과일장수 {
	public int solution(int k, int m, int[] score) {
        // k = 최대점수, m = 한상자 몇개 , score = 사과들의 점수
        int answer = 0;
         
        Arrays.sort(score);
        int[] reversedScore = new int[score.length];

        for(int i= 0; i<score.length; i++){
            reversedScore[i] = score[score.length-i-1];
        }
        
        if((score.length / m) ==0) return answer;
        
        for(int i=1; i <= (score.length / m); i++){
            answer += reversedScore[(m*i)-1]*m;
        }       
        
        return answer;        
        
    }
}
